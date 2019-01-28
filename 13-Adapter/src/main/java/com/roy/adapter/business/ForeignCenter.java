package com.roy.adapter.business;

/**
 * @Author: Roy
 * @Date: 2019/1/28 16:22
 */
public class ForeignCenter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void 进攻(){
        System.out.println("外籍中锋" + this.name + "进攻");
    }

    public void 防守(){
        System.out.println("外籍中锋" + this.name + "防守");
    }
}
