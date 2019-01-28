package com.roy.adapter.business;

/**
 * 前锋
 * @Author: Roy
 * @Date: 2019/1/28 16:20
 */
public class Center extends Player {
    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("中锋"+this.name+"进攻");
    }

    @Override
    public void defense() {
        System.out.println("中锋"+this.name+"防守");
    }
}
