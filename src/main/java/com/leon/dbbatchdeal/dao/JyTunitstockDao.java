package com.leon.dbbatchdeal.dao;

import com.leon.dbbatchdeal.dto.JyTunitstock;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * (JyTunitstock)表数据库访问层
 *
 * @author makejava
 * @date 2022-11-07 20:21:25
 */
public interface JyTunitstockDao {

    /**
     * 通过ID查询单条数据
     *
     * @param combiId 主键
     * @return 实例对象
     */
    JyTunitstock queryByPk(Integer combiId);

    /**
     * 查询指定行数据
     *
     * @param jyTunitstock 查询条件
     * @param offset       位置
     * @param pageSize     页面大小
     * @return 对象列表
     */
    List<JyTunitstock> queryAllByLimit(JyTunitstock jyTunitstock, @Param("offset") Integer offset, @Param("pageSize") Integer pageSize);

    /**
     * 统计总行数
     *
     * @param jyTunitstock 查询条件
     * @return 总行数
     */
    long count(JyTunitstock jyTunitstock);

    /**
     * 新增数据
     *
     * @param jyTunitstock 实例对象
     * @return 影响行数
     */
    int insert(JyTunitstock jyTunitstock);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<JyTunitstock> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<JyTunitstock> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<JyTunitstock> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<JyTunitstock> entities);

    /**
     * 修改数据
     *
     * @param jyTunitstock 实例对象
     * @return 影响行数
     */
    int update(JyTunitstock jyTunitstock);

    /**
     * 通过主键删除数据
     *
     * @param combiId 主键
     * @return 影响行数
     */
    int deleteByPk(Integer combiId);

    Integer getCombiId();

}

