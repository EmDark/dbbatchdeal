package com.leon.dbbatchdeal.service.impl;


import com.leon.dbbatchdeal.dao.HisjyTentrustsDao;
import com.leon.dbbatchdeal.entity.HisjyTentrusts;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by df on 2018/9/20.
 */
public class ThredQuery implements Callable<List> {


    private List page;//每次分页查出来的数据
    private HisjyTentrustsDao hisjyTentrustsDao;//每次分页查出来的数据
    private HisjyTentrusts hisjyTentrusts;//每次分页查出来的数据
    private Pageable pageable;//每次分页查出来的数据

    public  ThredQuery(HisjyTentrustsDao hisjyTentrustsDao,HisjyTentrusts hisjyTentrusts,  Pageable pageable) {
        this.hisjyTentrustsDao = hisjyTentrustsDao;
        this.hisjyTentrusts=hisjyTentrusts;
        this.pageable=pageable;
    }

    @Override
    public List call() throws Exception {
        //返回数据给Future
        return this.hisjyTentrustsDao.queryAllByLimit(hisjyTentrusts,pageable);
    }

    public List getPage() {
        return page;
    }

    public void setPage(List page) {
        this.page = page;
    }

    public HisjyTentrustsDao getHisjyTentrustsDao() {
        return hisjyTentrustsDao;
    }

    public void setHisjyTentrustsDao(HisjyTentrustsDao hisjyTentrustsDao) {
        this.hisjyTentrustsDao = hisjyTentrustsDao;
    }

    public HisjyTentrusts getHisjyTentrusts() {
        return hisjyTentrusts;
    }

    public void setHisjyTentrusts(HisjyTentrusts hisjyTentrusts) {
        this.hisjyTentrusts = hisjyTentrusts;
    }

    public Pageable getPageable() {
        return pageable;
    }

    public void setPageable(Pageable pageable) {
        this.pageable = pageable;
    }
}