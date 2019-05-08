package com.roy.mediator.business;

/**
 * 抽象同事类
 * @Author: Roy
 * @Date: 2019/5/8 16:14
 */
public abstract class Colleague {
    protected final Mediator mediator;

    protected Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
