package com.leon.dbbatchdeal.dto;

import com.leon.dbbatchdeal.dao.HisjyTentrustsDao;
import com.leon.dbbatchdeal.entity.HisjyTentrusts;

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
public class ThreadInsertDataDto  implements Callable<Boolean> {
    private HisjyTentrustsDao hisjyTentrustsDao;
    private List<HisjyTentrusts> set;

    public ThreadInsertDataDto(HisjyTentrustsDao dataService, List<HisjyTentrusts> set) {
        this.hisjyTentrustsDao = dataService;
        this.set = set;
    }

    @Override
    public Boolean call() throws Exception {
        if (hisjyTentrustsDao !=null){
            hisjyTentrustsDao.insertBatch(set);
        }
        return true;
    }
}
