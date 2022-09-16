package com.leon.dbbatchdeal.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 文件描述
 *
 * @Package: OPlusWeb
 * @Description: note
 * @Author: 胡亮
 * @CreateDate: 2022/9/1 - 14:02
 * @UpdateUser: huliang46396
 * @UpdateDate: 2022/9/1 - 14:02
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright © 2022 Hundsun Technologies Inc. All Rights Reserved
 */
@Configuration
@Slf4j
public class AsyncConfig implements AsyncConfigurer {

    /**
     * 得到异步执行程序
     *
     * @return {@link Executor}
     * @Resource(name = "SpExecutor")
     * private ThreadPoolTaskExecutor executor;
     */
    @Bean("SpExecutor")
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(50,50,600, TimeUnit.SECONDS,new ArrayBlockingQueue<>(1000000),new ThreadPoolExecutor.CallerRunsPolicy());
        log.info("线程池初始化完成");
        return executor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }


}
