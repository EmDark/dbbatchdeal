package com.leon.dbbatchdeal.service.impl;

import com.google.common.collect.Lists;
import com.leon.dbbatchdeal.dto.ThreadInsertDataDto;
import com.leon.dbbatchdeal.entity.HisjyTentrusts;
import com.leon.dbbatchdeal.dao.HisjyTentrustsDao;
import com.leon.dbbatchdeal.service.HisjyTentrustsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * (HisjyTentrusts)表服务实现类
 *
 * @author makejava
 * @since 2022-08-25 10:50:45
 */
@Service("hisjyTentrustsService")
public class HisjyTentrustsServiceImpl implements HisjyTentrustsService {
    private static final Logger logger = LoggerFactory.getLogger(HisjyTentrustsServiceImpl.class);
    @Resource
    private HisjyTentrustsDao hisjyTentrustsDao;


    @Override
    public void insertDatas() {
        final Integer threadSize=5;
        HisjyTentrusts hisjyTentrusts = new HisjyTentrusts();
        hisjyTentrusts.setFundId(13);
        final Long total=hisjyTentrustsDao.count(hisjyTentrusts);
        logger.info("总共{}个数据",total);
        if (total>0){
            Long pageSize=10L;
            if (total > 10) {
                pageSize=(total%threadSize==0)?total/threadSize:total/threadSize+1;
            }
            List<HisjyTentrusts> datas;
            ExecutorService executorService= Executors.newFixedThreadPool(threadSize);
            List<ThreadInsertDataDto> list= Lists.newLinkedList();
            for (Long i=1L;i<=threadSize;i++){
                if (Objects.equals(i, threadSize)){
                    pageSize = total - (threadSize-1) * pageSize;
                }
                PageRequest d= PageRequest.of(i.intValue(),pageSize.intValue());
                datas=hisjyTentrustsDao.queryAllByLimit(hisjyTentrusts,d);
                logger.info("查询数据完毕 size:{}",datas.size());
                list.add(new ThreadInsertDataDto(hisjyTentrustsDao,datas));
            }
            try {
                logger.info("invokeAll");
                executorService.invokeAll(list);
                logger.info("执行完毕");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    /**
     * 通过ID查询单条数据
     *
     * @param businessDate 主键
     * @return 实例对象
     */
    @Override
    public HisjyTentrusts queryById(Integer businessDate) {
        return this.hisjyTentrustsDao.queryById(businessDate);
    }

    /**
     * 分页查询
     *
     * @param hisjyTentrusts 筛选条件
     * @param pageRequest    分页对象
     * @return 查询结果
     */
    @Override
    public Page<HisjyTentrusts> queryByPage(HisjyTentrusts hisjyTentrusts, PageRequest pageRequest) {
        if (pageRequest == null) {
            pageRequest = PageRequest.of(0, 10);
        }
        long total = this.hisjyTentrustsDao.count(hisjyTentrusts);
        return new PageImpl<>(this.hisjyTentrustsDao.queryAllByLimit(hisjyTentrusts, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param hisjyTentrusts 实例对象
     * @return 实例对象
     */
    @Override
    public HisjyTentrusts insert(HisjyTentrusts hisjyTentrusts) {
        this.hisjyTentrustsDao.insert(hisjyTentrusts);
        return hisjyTentrusts;
    }

    /**
     * 修改数据
     *
     * @param hisjyTentrusts 实例对象
     * @return 实例对象
     */
    @Override
    public HisjyTentrusts update(HisjyTentrusts hisjyTentrusts) {
        this.hisjyTentrustsDao.update(hisjyTentrusts);
        return this.queryById(hisjyTentrusts.getBusinessDate());
    }

    /**
     * 通过主键删除数据
     *
     * @param businessDate 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer businessDate) {
        return this.hisjyTentrustsDao.deleteById(businessDate) > 0;
    }
}
