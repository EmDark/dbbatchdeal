package com.leon.dbbatchdeal.service;

import com.leon.dbbatchdeal.entity.JyTentrusts;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (JyTentrusts)表服务接口
 *
 * @author makejava
 * @since 2022-09-09 13:19:18
 */
public interface JyTentrustsService {
     void insertDatas(Integer threadSize, Integer batchNum, Integer num);
    /**
     * 通过ID查询单条数据
     *
     * @param entrustSerialNo 主键
     * @return 实例对象
     */
    JyTentrusts queryById(Integer entrustSerialNo);

    /**
     * 分页查询
     *
     * @param jyTentrusts 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<JyTentrusts> queryByPage(JyTentrusts jyTentrusts, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param jyTentrusts 实例对象
     * @return 实例对象
     */
    JyTentrusts insert(JyTentrusts jyTentrusts);

    /**
     * 修改数据
     *
     * @param jyTentrusts 实例对象
     * @return 实例对象
     */
    JyTentrusts update(JyTentrusts jyTentrusts);

    /**
     * 通过主键删除数据
     *
     * @param entrustSerialNo 主键
     * @return 是否成功
     */
    boolean deleteById(Integer entrustSerialNo);

}
