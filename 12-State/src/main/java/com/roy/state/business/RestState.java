package com.roy.state.business;

/**
 * @Author: Roy
 * @Date: 2019/1/21 15:12
 */
public class RestState extends State {
    @Override
    public void writeProgram(Work w) {
        System.out.println("当前时间：" + w.getHour() + "点 下班回家");
    }
}
