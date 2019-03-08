package com.roy.singleton.business;

/**
 * @Author: Roy
 * @Date: 2019/3/8 9:33
 */
public class SingletonSix {

    private SingletonSix(){

    }

    private enum Singleton{
        INSTANCE;

        private final SingletonSix instance;

        //枚举的构造函数是私有的，并且只会执行一次
        Singleton(){
            instance = new SingletonSix();
        }

        public SingletonSix getInstance() {
            return instance;
        }
    }

    public SingletonSix getInstance(){
        return Singleton.INSTANCE.getInstance();
    }
}
