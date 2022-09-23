package com.leon.dbbatchdeal.dao;

import com.leon.dbbatchdeal.entity.JyTrealdeal;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (JyTrealdeal)表数据库访问层
 *
 * @author makejava
 * @since 2022-09-09 17:37:29
 */
public interface JyTrealdealDao {

    /**
     * 通过ID查询单条数据
     *
     * @param realdealSerialNo 主键
     * @return 实例对象
     */
    JyTrealdeal queryById(Integer realdealSerialNo);

    /**
     * 查询指定行数据
     *
     * @param jyTrealdeal 查询条件
     * @param pageable    分页对象
     * @return 对象列表
     */
    List<JyTrealdeal> queryAllByLimit(JyTrealdeal jyTrealdeal, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param jyTrealdeal 查询条件
     * @return 总行数
     */
    long count(JyTrealdeal jyTrealdeal);

    /**
     * 新增数据
     *
     * @param jyTrealdeal 实例对象
     * @return 影响行数
     */
    int insert(JyTrealdeal jyTrealdeal);

    int insertNoKey(JyTrealdeal jyTrealdeal);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<JyTrealdeal> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<JyTrealdeal> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<JyTrealdeal> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<JyTrealdeal> entities);

    /**
     * 修改数据
     *
     * @param jyTrealdeal 实例对象
     * @return 影响行数
     */
    int update(JyTrealdeal jyTrealdeal);

    /**
     * 通过主键删除数据
     *
     * @param realdealSerialNo 主键
     * @return 影响行数
     */
    int deleteById(Integer realdealSerialNo);

    Integer getMaxrealdeal_serial_no();


}

