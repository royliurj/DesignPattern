package com.roy.singleton.business;

/**
 * @Author: Roy
 * @Date: 2019/2/15 15:56
 */
public class SingletonFour {
    private static SingletonFour instance = new SingletonFour();

    private SingletonFour(){
    }

    public static SingletonFour getInstance(){
        return instance;
    }
}
