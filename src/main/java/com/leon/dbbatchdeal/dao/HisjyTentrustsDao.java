package com.leon.dbbatchdeal.dao;

import com.leon.dbbatchdeal.entity.HisjyTentrusts;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (HisjyTentrusts)表数据库访问层
 *
 * @author makejava
 * @since 2022-08-25 10:50:37
 */

@Mapper
@Primary
public interface HisjyTentrustsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param businessDate 主键
     * @return 实例对象
     */
    HisjyTentrusts queryById(Integer businessDate);

    /**
     * 查询指定行数据
     *
     * @param hisjyTentrusts 查询条件
     * @param pageable       分页对象
     * @return 对象列表
     */
    List<HisjyTentrusts> queryAllByLimit(HisjyTentrusts hisjyTentrusts,@Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param hisjyTentrusts 查询条件
     * @return 总行数
     */
    long count(HisjyTentrusts hisjyTentrusts);

    /**
     * 新增数据
     *
     * @param hisjyTentrusts 实例对象
     * @return 影响行数
     */
    int insert(HisjyTentrusts hisjyTentrusts);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<HisjyTentrusts> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<HisjyTentrusts> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<HisjyTentrusts> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<HisjyTentrusts> entities);

    /**
     * 修改数据
     *
     * @param hisjyTentrusts 实例对象
     * @return 影响行数
     */
    int update(HisjyTentrusts hisjyTentrusts);

    /**
     * 通过主键删除数据
     *
     * @param businessDate 主键
     * @return 影响行数
     */
    int deleteById(Integer businessDate);

}

