package com.roy.mediator.business;

/**
 * 抽象中介者
 * @Author: Roy
 * @Date: 2019/5/8 16:13
 */
public abstract class Mediator {
    public abstract void send(String message, Colleague colleague);
}
