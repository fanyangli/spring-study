package com.spring.orm.aop;

/**
 * Created by lenovo on 2019/3/7.
 */
public class TankPoxy implements Move {
    private  Move t;
    public TankPoxy(Move t){
        this.t=t;
    }

    @Override
    public void move() {
        System.out.print("attack");
        t.move();
        System.out.print("bomb");

    }
}
