package com.leon.dbbatchdeal.service;

import com.leon.dbbatchdeal.entity.HisjyTrealdeal;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (HisjyTrealdeal)表服务接口
 *
 * @author makejava
 * @since 2022-09-09 17:39:16
 */
public interface HisjyTrealdealService {

    /**
     * 通过ID查询单条数据
     *
     * @param businessDate 主键
     * @return 实例对象
     */
    HisjyTrealdeal queryById(Integer businessDate);

    /**
     * 分页查询
     *
     * @param hisjyTrealdeal 筛选条件
     * @param pageRequest    分页对象
     * @return 查询结果
     */
    Page<HisjyTrealdeal> queryByPage(HisjyTrealdeal hisjyTrealdeal, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param hisjyTrealdeal 实例对象
     * @return 实例对象
     */
    HisjyTrealdeal insert(HisjyTrealdeal hisjyTrealdeal);

    /**
     * 修改数据
     *
     * @param hisjyTrealdeal 实例对象
     * @return 实例对象
     */
    HisjyTrealdeal update(HisjyTrealdeal hisjyTrealdeal);

    /**
     * 通过主键删除数据
     *
     * @param businessDate 主键
     * @return 是否成功
     */
    boolean deleteById(Integer businessDate);

    void insertDatas(Integer threadSize, Integer batchNum, Integer num);
}
