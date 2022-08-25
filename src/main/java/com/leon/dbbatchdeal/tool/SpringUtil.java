package com.leon.dbbatchdeal.tool;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringUtil implements ApplicationContextAware {

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("加载上下文对象");
        context = applicationContext;
    }


    /**
     * 获取上下文对象
     * @return
     */
    public static ApplicationContext getApplicationContext(){
        return context;
    }


    public static Object getBean(String name){
        return getApplicationContext().getBean(name);
    }



    public static <T> T getBean(Class<T> requiredType) throws BeansException{
        return getApplicationContext().getBean(requiredType);
    }


}
