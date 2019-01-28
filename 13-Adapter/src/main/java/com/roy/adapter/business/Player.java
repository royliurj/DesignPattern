package com.roy.adapter.business;

/**
 * @Author: Roy
 * @Date: 2019/1/28 16:19
 */
public abstract class Player {
    protected String name;
    public Player(String name){
        this.name = name;
    }

    public abstract void attack();
    public abstract void defense();
}
