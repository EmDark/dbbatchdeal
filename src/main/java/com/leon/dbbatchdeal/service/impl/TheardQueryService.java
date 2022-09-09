package com.leon.dbbatchdeal.service.impl;


import com.leon.dbbatchdeal.dao.HisjyTentrustsDao;
import com.leon.dbbatchdeal.entity.HisjyTentrusts;
import org.assertj.core.util.Lists;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

import java.util.List;
import java.util.concurrent.*;

/**
 * Created by df on 2018/9/20.
 */

@Service
public class TheardQueryService {

    @Resource
    private HisjyTentrustsDao hisjyTentrustsDao;

    public List<List> getMaxResult(int type) throws InterruptedException, ExecutionException {
        int num = 10000;//一次查询多少条
        int t=5;
        if (type == 1) {
            HisjyTentrusts hisjyTentrusts = new HisjyTentrusts();
            long start = System.currentTimeMillis();//开始时间
            List<List> result = new ArrayList<>();//返回结果
            PageRequest pageable = PageRequest.of(1, t*num);
            result.add(hisjyTentrustsDao.queryAllByLimit(hisjyTentrusts, pageable));
            long end = System.currentTimeMillis();
            System.out.println("线程查询数据用时:" + (end - start) + "ms");
            return result;
        }else{
            HisjyTentrusts hisjyTentrusts = new HisjyTentrusts();
            long start = System.currentTimeMillis();//开始时间
            List<List> result = new ArrayList<>();//返回结果
            //查询数据库总数量
            Long count = hisjyTentrustsDao.count(new HisjyTentrusts());
            //需要查询的次数
            int times = count.intValue() / num;
            if (count % num != 0) {
                times = times + 1;
            }
            //开始页数  连接的是orcle的数据库  封装的分页方式  我的是从1开始
            int bindex = 1;
            PageRequest pageable = PageRequest.of(bindex, num);
            //Callable用于产生结果
            List<Callable<List>> tasks = new ArrayList<>();
            for (int i = 0; i < times; i++) {
                Callable<List> qfe = new ThredQuery(hisjyTentrustsDao,hisjyTentrusts,pageable);
                tasks.add(qfe);
                bindex += 1;
                pageable = PageRequest.of(bindex,num);
                if (bindex > t) {
                    break;
                }
            }
            //定义固定长度的线程池  防止线程过多
            ExecutorService executorService = Executors.newFixedThreadPool(15);
            //Future用于获取结果
            List<Future<List>> futures = executorService.invokeAll(tasks);
            //处理线程返回结果
            if (futures != null && futures.size() > 0) {
                for (Future<List> future : futures) {
                    result.addAll(future.get());
                }
            }

            executorService.shutdown();//关闭线程池
            long end = System.currentTimeMillis();
            System.out.println("线程查询数据用时:" + (end - start) + "ms");
            return result;
        }

    }


}