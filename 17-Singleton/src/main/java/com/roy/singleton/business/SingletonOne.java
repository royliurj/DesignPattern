package com.roy.singleton.business;

/**
 * 只适用于带线程环境
 * @Author: Roy
 * @Date: 2019/2/15 15:48
 */
public class SingletonOne {
    private static SingletonOne instance = null;

    private SingletonOne(){

    }

    public static SingletonOne getInstance(){
        if(instance == null){
            instance = new SingletonOne();
        }
        return instance;
    }
}
