package com.leon.dbbatchdeal.dto;

import com.leon.dbbatchdeal.dao.HisjyTentrustsDao;
import com.leon.dbbatchdeal.dao.HisjyTrealdealDao;
import com.leon.dbbatchdeal.dao.JyTentrustsDao;
import com.leon.dbbatchdeal.dao.JyTrealdealDao;
import com.leon.dbbatchdeal.dao.JyTunitstockDao;
import com.leon.dbbatchdeal.entity.HisjyTentrusts;
import com.leon.dbbatchdeal.entity.HisjyTrealdeal;
import com.leon.dbbatchdeal.entity.JyTentrusts;
import com.leon.dbbatchdeal.entity.JyTrealdeal;
import java.util.List;
import java.util.concurrent.Callable;
import lombok.extern.slf4j.Slf4j;

/**
 * 文件描述
 *
 * @Package: dbbatchdeal
 * @Description: note
 * @Author: 胡亮
 * @CreateDate: 2022/8/25 - 10:16
 * @UpdateUser: huliang46396
 * @UpdateDate: 2022/8/25 - 10:16
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright © 2022 Hundsun Technologies Inc. All Rights Reserved
 */
@Slf4j
public class ThreadInsertDataDto implements Callable<Boolean> {

    private HisjyTentrustsDao hisjyTentrustsDao;
    private JyTentrustsDao jyTentrustsDao;
    private JyTrealdealDao jyTrealdealDao;
    private HisjyTrealdealDao hisjyTrealdealDao;

    private JyTunitstockDao jyTunitstockDao;
    private List<HisjyTentrusts> set;
    private List<JyTentrusts> jyset;
    private List<JyTrealdeal> jyTrealdealList;
    private List<HisjyTrealdeal> hisjyTrealdealList;
    private List<JyTunitstock> jyTunitstockList;

    public ThreadInsertDataDto(JyTunitstockDao dataService, List<JyTunitstock> set) {
        this.jyTunitstockDao = dataService;
        this.jyTunitstockList = set;
    }

    public ThreadInsertDataDto(HisjyTentrustsDao dataService, List<HisjyTentrusts> set) {
        this.hisjyTentrustsDao = dataService;
        this.set = set;
    }

    public ThreadInsertDataDto(JyTentrustsDao dataService, List<JyTentrusts> jyset) {
        this.jyTentrustsDao = dataService;
        this.jyset = jyset;
    }


    public ThreadInsertDataDto(JyTrealdealDao jyTrealdealDao, List<JyTrealdeal> jyTrealdealList) {
        this.jyTrealdealList=jyTrealdealList;
        this.jyTrealdealDao=jyTrealdealDao;
    }

    public ThreadInsertDataDto(HisjyTrealdealDao hisjyTrealdealDao, List<HisjyTrealdeal> datas) {
        this.hisjyTrealdealList=datas;
        this.hisjyTrealdealDao=hisjyTrealdealDao;
    }

    @Override
    public Boolean call() throws Exception {
        long s = System.currentTimeMillis();
        Integer count = 0;
        try {
            if (hisjyTentrustsDao != null) {
                count = hisjyTentrustsDao.insertBatch(set);
            } else if (jyTentrustsDao != null) {
                count = jyTentrustsDao.insertBatch(jyset);
            } else if (hisjyTrealdealDao != null) {
                count = hisjyTrealdealDao.insertBatch(hisjyTrealdealList);
            } else if (jyTrealdealDao != null) {
                count = jyTrealdealDao.insertBatch(jyTrealdealList);
            } else if (jyTunitstockDao != null) {
                count = jyTunitstockDao.insertBatch(jyTunitstockList);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long e=System.currentTimeMillis();
        log.info("end insert num :{} cost:{} ms", count, e - s);
        return true;
    }
}
