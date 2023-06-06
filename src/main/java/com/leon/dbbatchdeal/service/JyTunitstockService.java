package com.leon.dbbatchdeal.service;

import com.leon.dbbatchdeal.dto.JyTunitstock;
import java.util.List;

/**
 * (JyTunitstock)表服务接口
 *
 * @author makejava
 * @date 2022-11-07 20:21:38
 */
public interface JyTunitstockService {

    /**
     * 通过ID查询单条数据
     *
     * @param combiId 主键
     * @return 实例对象
     */
    JyTunitstock queryByPk(Integer combiId);

    /**
     * 分页查询
     *
     * @param jyTunitstock 筛选条件
     * @param offset       位移
     * @param pageSize     页面大小
     * @return 查询结果
     */
    List<JyTunitstock> queryByPage(JyTunitstock jyTunitstock, Integer offset, Integer pageSize);

    /**
     * 新增数据
     *
     * @param jyTunitstock 实例对象
     * @return 实例对象
     */
    JyTunitstock insert(JyTunitstock jyTunitstock);

    /**
     * 修改数据
     *
     * @param jyTunitstock 实例对象
     * @return 实例对象
     */
    JyTunitstock update(JyTunitstock jyTunitstock);

    /**
     * 通过主键删除数据
     *
     * @param combiId 主键
     * @return 是否成功
     */
    boolean deleteByPk(Integer combiId);

    void insertDatas(Integer type, Integer threadSize, Integer batchNum, Integer num);
}
