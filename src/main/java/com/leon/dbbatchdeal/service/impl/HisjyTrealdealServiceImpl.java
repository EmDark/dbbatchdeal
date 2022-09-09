package com.leon.dbbatchdeal.service.impl;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.leon.dbbatchdeal.dto.ThreadInsertDataDto;
import com.leon.dbbatchdeal.entity.HisjyTrealdeal;
import com.leon.dbbatchdeal.dao.HisjyTrealdealDao;
import com.leon.dbbatchdeal.entity.JyTentrusts;
import com.leon.dbbatchdeal.entity.JyTrealdeal;
import com.leon.dbbatchdeal.service.HisjyTrealdealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * (HisjyTrealdeal)表服务实现类
 *
 * @author makejava
 * @since 2022-09-09 17:39:16
 */
@Service("hisjyTrealdealService")
@Slf4j
public class HisjyTrealdealServiceImpl implements HisjyTrealdealService {
    @Resource
    private HisjyTrealdealDao hisjyTrealdealDao;

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
    @Override
    public void insertDatas(Integer threadSize, Integer batchNum, Integer num) {
        String modelEntityJson = "{\n" +
                "    \"businessDate\": 20220629,\n" +
                "    \"companyId\": 100005,\n" +
                "    \"realdealSerialNo\": 258486,\n" +
                "    \"entrustSerialNo\": 1098,\n" +
                "    \"batchSerialNo\": 1097,\n" +
                "    \"reportSerialNo\": 114,\n" +
                "    \"fundId\": 22,\n" +
                "    \"assetId\": 41,\n" +
                "    \"combiId\": 41,\n" +
                "    \"marketNo\": 2,\n" +
                "    \"reportCode\": \"000001\",\n" +
                "    \"interCode\": 1002,\n" +
                "    \"stockholderId\": \"B00050001\",\n" +
                "    \"tradeSeat\": \"V_5\",\n" +
                "    \"investType\": \"1\",\n" +
                "    \"entrustDirection\": 1,\n" +
                "    \"dealAmount\": 2000,\n" +
                "    \"dealPrice\": 12.48,\n" +
                "    \"dealBalance\": 24960,\n" +
                "    \"dealTime\": 150758,\n" +
                "    \"operatorNo\": 1007,\n" +
                "    \"timeStamp\": \"2022-08-30T15:08:06.000+00:00\",\n" +
                "    \"dealNo\": \"39\",\n" +
                "    \"totalFee\": 0,\n" +
                "    \"feeJy\": 0,\n" +
                "    \"feeYh\": 0,\n" +
                "    \"feeGh\": 0,\n" +
                "    \"feeCommission\": 0,\n" +
                "    \"feeJs\": 0,\n" +
                "    \"feeZg\": 0,\n" +
                "    \"feeQt\": 0,\n" +
                "    \"feeSx\": 0,\n" +
                "    \"feeRisk\": 0,\n" +
                "    \"feeJsfw\": 0,\n" +
                "    \"feeJg\": 0,\n" +
                "    \"tradePlatformId\": 4,\n" +
                "    \"schemeCode\": \"\",\n" +
                "    \"capitalAccountNo\": \"00050001\",\n" +
                "    \"tradeInterfaceType\": 5,\n" +
                "    \"insId\": 234,\n" +
                "    \"indexDailyModify\": 0,\n" +
                "    \"externalOrdid\": 1,\n" +
                "    \"thirdRemark\": \"trade_interface_type=5;protect_limit_price=0\",\n" +
                "    \"msgSendStatus\": 0,\n" +
                "    \"validFlag\": \"\",\n" +
                "    \"blockId\": 0\n" +
                "}";

        Integer max=hisjyTrealdealDao.getMaxrealdeal_serial_no();
        ThreadPoolExecutor executorService = new ThreadPoolExecutor(threadSize,threadSize,60, TimeUnit.SECONDS,new LinkedBlockingQueue<>(100),new ThreadPoolExecutor.CallerRunsPolicy());
        List<HisjyTrealdeal> datas = new ArrayList<>();

        Integer realdeal_serial_no = max+1;
        Integer dateInt = 20220315;
        Integer company_id = 100008;
        Integer fund_id = 15;
        Integer asset_id = 34;
        Integer combi_id = 34;
        List<ThreadInsertDataDto> list = Lists.newLinkedList();


        for (int i = 0; i < num; i++) {
            HisjyTrealdeal hisjyTentrusts = JSON.parseObject(modelEntityJson, HisjyTrealdeal.class);
            hisjyTentrusts.setAssetId(asset_id);
            hisjyTentrusts.setCombiId(combi_id);
            hisjyTentrusts.setFundId(fund_id);
            hisjyTentrusts.setCompanyId(company_id);
            hisjyTentrusts.setBatchSerialNo(realdeal_serial_no);
            hisjyTentrusts.setRealdealSerialNo(realdeal_serial_no);
            hisjyTentrusts.setBusinessDate(dateInt);
            datas.add(hisjyTentrusts);
            realdeal_serial_no+=1;
            if (i % 1000 == 0) {
                fund_id+=1;
                asset_id+=1;
                combi_id+=1;
            }
            if (i % 10000 == 0) {
                LocalDate localDateTime = LocalDate.parse(dateInt.toString(), dateTimeFormatter);
                localDateTime = localDateTime.minusDays(1L);
                dateInt = Integer.valueOf(localDateTime.format(dateTimeFormatter));
                company_id+=1;
            }
            if (datas.size() >= batchNum) {
                //list.add(new ThreadInsertDataDto(hisjyTentrustsDao, datas));
                executorService.submit(new ThreadInsertDataDto(hisjyTrealdealDao, datas));
                log.info("submit");
                datas = new ArrayList<>();
            }
        }
        if (datas.size() > 0) {
            //list.add(new ThreadInsertDataDto(jyTentrustsDao, datas));
            executorService.submit(new ThreadInsertDataDto(hisjyTrealdealDao, datas));
            log.info("submit last size:{}",datas.size());
        }
        //try {
        //    executorService.invokeAll(list);
        //} catch (InterruptedException e) {
        //    throw new RuntimeException(e);
        //}
        log.info("task done :{} ",executorService.getCompletedTaskCount());;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param businessDate 主键
     * @return 实例对象
     */
    @Override
    public HisjyTrealdeal queryById(Integer businessDate) {
        return this.hisjyTrealdealDao.queryById(businessDate);
    }

    /**
     * 分页查询
     *
     * @param hisjyTrealdeal 筛选条件
     * @param pageRequest    分页对象
     * @return 查询结果
     */
    @Override
    public Page<HisjyTrealdeal> queryByPage(HisjyTrealdeal hisjyTrealdeal, PageRequest pageRequest) {
        long total = this.hisjyTrealdealDao.count(hisjyTrealdeal);
        return new PageImpl<>(this.hisjyTrealdealDao.queryAllByLimit(hisjyTrealdeal, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param hisjyTrealdeal 实例对象
     * @return 实例对象
     */
    @Override
    public HisjyTrealdeal insert(HisjyTrealdeal hisjyTrealdeal) {
        this.hisjyTrealdealDao.insert(hisjyTrealdeal);
        return hisjyTrealdeal;
    }

    /**
     * 修改数据
     *
     * @param hisjyTrealdeal 实例对象
     * @return 实例对象
     */
    @Override
    public HisjyTrealdeal update(HisjyTrealdeal hisjyTrealdeal) {
        this.hisjyTrealdealDao.update(hisjyTrealdeal);
        return this.queryById(hisjyTrealdeal.getBusinessDate());
    }

    /**
     * 通过主键删除数据
     *
     * @param businessDate 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer businessDate) {
        return this.hisjyTrealdealDao.deleteById(businessDate) > 0;
    }
}
