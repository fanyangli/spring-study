package com.spring.orm.aop;

/**
 * Created by lenovo on 2019/3/7.
 */
public class HelloImpl implements Hello{
    @Override
    public String getHello() {
        return "hello,springAOP";
    }
}
