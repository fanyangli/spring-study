package com.spring.orm.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2019/3/7.
 */
public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Hello hello=(Hello)context.getBean(Hello.class);
        System.out.println(hello.getHello());
    }

}
