package com.roy.flyweight.business;

/**
 * 围棋棋子类：抽象享元类
 * @Author: Roy
 * @Date: 2019/5/9 17:05
 */
public abstract class IgoChessman {
    public abstract String getColor();

    public void display() {
        System.out.println("棋子颜色：" + this.getColor());
    }
}
