package com.spring.orm.aop;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Administrator on 2019/3/7.
 * 用户自定义的前置增强表
 */
public class  BeforeAdvice {
  private static final Logger logger=LoggerFactory.getLogger("UserDao.class");
  public void beforeMethod(){ logger.info("连接数据库");}
}

