package com.leon.dbbatchdeal.dao;

import com.leon.dbbatchdeal.entity.HisjyTrealdeal;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (HisjyTrealdeal)表数据库访问层
 *
 * @author makejava
 * @since 2022-09-09 17:39:02
 */
public interface HisjyTrealdealDao {

    /**
     * 通过ID查询单条数据
     *
     * @param businessDate 主键
     * @return 实例对象
     */
    HisjyTrealdeal queryById(Integer businessDate);

    /**
     * 查询指定行数据
     *
     * @param hisjyTrealdeal 查询条件
     * @param pageable       分页对象
     * @return 对象列表
     */
    List<HisjyTrealdeal> queryAllByLimit(HisjyTrealdeal hisjyTrealdeal, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param hisjyTrealdeal 查询条件
     * @return 总行数
     */
    long count(HisjyTrealdeal hisjyTrealdeal);

    /**
     * 新增数据
     *
     * @param hisjyTrealdeal 实例对象
     * @return 影响行数
     */
    int insert(HisjyTrealdeal hisjyTrealdeal);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<HisjyTrealdeal> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<HisjyTrealdeal> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<HisjyTrealdeal> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<HisjyTrealdeal> entities);

    /**
     * 修改数据
     *
     * @param hisjyTrealdeal 实例对象
     * @return 影响行数
     */
    int update(HisjyTrealdeal hisjyTrealdeal);

    /**
     * 通过主键删除数据
     *
     * @param businessDate 主键
     * @return 影响行数
     */
    int deleteById(Integer businessDate);


    Integer getMaxrealdeal_serial_no();

}

