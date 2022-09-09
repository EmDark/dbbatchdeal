package com.leon.dbbatchdeal.dao;

import com.leon.dbbatchdeal.entity.JyTentrusts;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (JyTentrusts)表数据库访问层
 *
 * @author makejava
 * @since 2022-09-09 13:19:05
 */
public interface JyTentrustsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param entrustSerialNo 主键
     * @return 实例对象
     */
    JyTentrusts queryById(Integer entrustSerialNo);

    /**
     * 查询指定行数据
     *
     * @param jyTentrusts 查询条件
     * @param pageable    分页对象
     * @return 对象列表
     */
    List<JyTentrusts> queryAllByLimit(JyTentrusts jyTentrusts, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param jyTentrusts 查询条件
     * @return 总行数
     */
    long count(JyTentrusts jyTentrusts);

    /**
     * 新增数据
     *
     * @param jyTentrusts 实例对象
     * @return 影响行数
     */
    int insert(JyTentrusts jyTentrusts);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<JyTentrusts> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<JyTentrusts> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<JyTentrusts> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<JyTentrusts> entities);

    /**
     * 修改数据
     *
     * @param jyTentrusts 实例对象
     * @return 影响行数
     */
    int update(JyTentrusts jyTentrusts);

    /**
     * 通过主键删除数据
     *
     * @param entrustSerialNo 主键
     * @return 影响行数
     */
    int deleteById(Integer entrustSerialNo);

    Integer getMaxEntrustSerialNo();

}

