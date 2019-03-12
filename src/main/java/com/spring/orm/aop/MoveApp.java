package com.spring.orm.aop;

/**
 * Created by lenovo on 2019/3/7.
 */
public class MoveApp {
    public static void main(String[] args) {
        Move t1=new Tank();
        Move moveProxy=new TankPoxy(t1);
        moveProxy.move();
    }
}
