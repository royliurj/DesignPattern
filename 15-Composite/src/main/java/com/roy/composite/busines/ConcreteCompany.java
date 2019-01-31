package com.roy.composite.busines;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Roy
 * @Date: 2019/1/31 15:14
 */
public class ConcreteCompany extends Company {
    private List<Company> children = new ArrayList<Company>();

    public ConcreteCompany(String name) {
        super(name);
    }


    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        String format = "%-" + depth + "s";
        System.out.println(String.format(format,"-") + getName());
        for (Company component : children){
            component.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company component : children) {
            component.lineOfDuty();

        }
    }
}
