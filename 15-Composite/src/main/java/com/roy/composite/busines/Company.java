package com.roy.composite.busines;

/**
 * 公司抽象类或接口
 * @Author: Roy
 * @Date: 2019/1/31 15:04
 */
public abstract class Company {
    public String getName() {
        return name;
    }

    private final String name;

    protected Company(String name) {
        this.name = name;
    }

    public abstract void add(Company c);
    public abstract void remove(Company c);
    public abstract void display(int depth);

    /**
     * 履行职责
     */
    public abstract void lineOfDuty();
}
