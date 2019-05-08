package com.roy.responsibilitychain.business;

/**
 * 处理请求的抽象
 * @Author: Roy
 * @Date: 2019/5/5 17:03
 */
public abstract class Manager {
    protected String name;
    protected Manager superior;

    public Manager(String name){
        this.name = name;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public abstract void requestApplications(Request request);
}
