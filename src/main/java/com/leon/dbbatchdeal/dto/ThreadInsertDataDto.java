package com.leon.dbbatchdeal.dto;

import com.leon.dbbatchdeal.dao.HisjyTentrustsDao;
import com.leon.dbbatchdeal.dao.JyTentrustsDao;
import com.leon.dbbatchdeal.entity.HisjyTentrusts;
import com.leon.dbbatchdeal.entity.JyTentrusts;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.Callable;

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
    private List<HisjyTentrusts> set;
    private List<JyTentrusts> jyset;


    public ThreadInsertDataDto(HisjyTentrustsDao dataService, List<HisjyTentrusts> set) {
        this.hisjyTentrustsDao = dataService;
        this.set = set;
    }
    public ThreadInsertDataDto(JyTentrustsDao dataService, List<JyTentrusts> jyset) {
        this.jyTentrustsDao = dataService;
        this.jyset = jyset;
    }
    @Override
    public Boolean call() throws Exception {
        long s=System.currentTimeMillis();
        try {
            if (hisjyTentrustsDao != null) {
                hisjyTentrustsDao.insertBatch(set);
            } else if (jyTentrustsDao != null) {
                jyTentrustsDao.insertBatch(jyset);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long e=System.currentTimeMillis();
        log.info("end cost:{} ms",e-s);
        return true;
    }
}
