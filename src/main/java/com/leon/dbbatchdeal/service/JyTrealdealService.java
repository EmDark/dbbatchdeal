package com.leon.dbbatchdeal.service;

import com.leon.dbbatchdeal.entity.JyTrealdeal;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (JyTrealdeal)表服务接口
 *
 * @author makejava
 * @since 2022-09-09 17:37:31
 */
public interface JyTrealdealService {

    /**
     * 通过ID查询单条数据
     *
     * @param realdealSerialNo 主键
     * @return 实例对象
     */
    JyTrealdeal queryById(Integer realdealSerialNo);

    /**
     * 分页查询
     *
     * @param jyTrealdeal 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<JyTrealdeal> queryByPage(JyTrealdeal jyTrealdeal, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param jyTrealdeal 实例对象
     * @return 实例对象
     */
    JyTrealdeal insert(JyTrealdeal jyTrealdeal);

    /**
     * 修改数据
     *
     * @param jyTrealdeal 实例对象
     * @return 实例对象
     */
    JyTrealdeal update(JyTrealdeal jyTrealdeal);

    /**
     * 通过主键删除数据
     *
     * @param realdealSerialNo 主键
     * @return 是否成功
     */
    boolean deleteById(Integer realdealSerialNo);

    void insertDatas(Integer type, Integer threadSize, Integer batchNum, Integer num);
}
