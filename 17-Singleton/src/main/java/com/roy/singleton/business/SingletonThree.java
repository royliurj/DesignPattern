package com.roy.singleton.business;

/**
 * @Author: Roy
 * @Date: 2019/2/15 15:53
 */
public class SingletonThree {
    private static SingletonThree instance = null;

    private SingletonThree(){
    }

    public static SingletonThree getInstance(){
        if(instance == null){
            synchronized (SingletonThree.class){
                if(instance == null){
                    instance = new SingletonThree();
                }
            }
        }
        return instance;
    }
}
