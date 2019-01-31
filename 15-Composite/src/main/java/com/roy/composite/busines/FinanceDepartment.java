package com.roy.composite.busines;

/**
 * @Author: Roy
 * @Date: 2019/1/31 15:23
 */
public class FinanceDepartment extends Company {
    private Company c;

    public FinanceDepartment(String name) {
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
        System.out.println(getName() + "负责财务支出管理");
    }
}
