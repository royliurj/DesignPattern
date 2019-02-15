package com.roy.singleton.business;

/**
 * 多线程环境
 * @Author: Roy
 * @Date: 2019/2/15 15:50
 */
public class SingletonTwo {
    private static SingletonTwo instance = null;

    private SingletonTwo(){
    }

    public static synchronized SingletonTwo getInstance(){
        if(instance == null){
            instance = new SingletonTwo();
        }
        return instance;
    }
}
