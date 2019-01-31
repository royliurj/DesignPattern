package com.roy.composite.busines;

/**
 * @Author: Roy
 * @Date: 2019/1/31 15:22
 */
public class HRDepartment extends Company {
    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void display(int depth) {
        String format = "%-" + depth + "s";
        System.out.println(String.format(format,"-") + getName());
    }

    @Override
    public void lineOfDuty() {
        System.out.println(getName() + "负责招聘培训管理");
    }
}
