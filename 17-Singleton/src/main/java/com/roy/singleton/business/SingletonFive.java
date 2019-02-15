package com.roy.singleton.business;

/**
 * @Author: Roy
 * @Date: 2019/2/15 15:58
 */
public class SingletonFive {
    private SingletonFive(){
    }

    private static class SingletonHolder{
        private final static SingletonFive instance = new SingletonFive();
    }

    public static SingletonFive getInstance(){
        return SingletonHolder.instance;
    }
}
