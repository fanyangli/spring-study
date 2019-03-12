package com.waylau.spring.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class Fighter {
    @Pointcut("execution(* com.waylau.spring.aop.Tiger.walk())")
    public void foundTiger() {
    }
    @Before(value = "foundTiger()")
    public void foundBefore(){
        System.out.println("Fighter wait for tiger...");
    }
    @AfterReturning("foundTiger()")
    public void foundAfter(){
        System.out.println("Fighter fight with tiger...");
    }
}

