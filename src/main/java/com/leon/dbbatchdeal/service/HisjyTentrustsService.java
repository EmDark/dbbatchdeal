package com.leon.dbbatchdeal.service;

import com.leon.dbbatchdeal.entity.HisjyTentrusts;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (HisjyTentrusts)表服务接口
 *
 * @author makejava
 * @since 2022-08-25 10:50:45
 */
public interface HisjyTentrustsService {

    void insertDatas(Integer threadSize, Integer batchNum, Integer num);

    /**
     * 通过ID查询单条数据
     *
     * @param businessDate 主键
     * @return 实例对象
     */
    HisjyTentrusts queryById(Integer businessDate);

    /**
     * 分页查询
     *
     * @param hisjyTentrusts 筛选条件
     * @param pageRequest    分页对象
     * @return 查询结果
     */
    Page<HisjyTentrusts> queryByPage(HisjyTentrusts hisjyTentrusts, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param hisjyTentrusts 实例对象
     * @return 实例对象
     */
    HisjyTentrusts insert(HisjyTentrusts hisjyTentrusts);

    /**
     * 修改数据
     *
     * @param hisjyTentrusts 实例对象
     * @return 实例对象
     */
    HisjyTentrusts update(HisjyTentrusts hisjyTentrusts);

    /**
     * 通过主键删除数据
     *
     * @param businessDate 主键
     * @return 是否成功
     */
    boolean deleteById(Integer businessDate);


}
