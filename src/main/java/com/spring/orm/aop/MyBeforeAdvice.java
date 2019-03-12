package com.spring.orm.aop;

import org.slf4j.LoggerFactory;

/**
 * 用户自定义的前置增强类
 */
public class MyBeforeAdvice {
    private static final org.slf4j.Logger logger= LoggerFactory.getLogger(MyBeforeAdvice.class);
    public void beforeMethod(){
        logger.debug("连接数据库。。。");
    }

}
