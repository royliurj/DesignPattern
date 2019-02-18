package com.roy.bridge.business;

/**
 * Abstraction
 * @Author: Roy
 * @Date: 2019/2/18 15:13
 */
public abstract class HandsetBrand {
    protected HandsetSoft soft;

    public void setHandsetSoft(HandsetSoft soft){
        this.soft = soft;
    }

    public abstract void run();
}
