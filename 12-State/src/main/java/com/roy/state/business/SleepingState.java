package com.roy.state.business;

/**
 * @Author: Roy
 * @Date: 2019/1/21 15:12
 */
public class SleepingState extends State {
    @Override
    public void writeProgram(Work w) {
        System.out.println("当前时间：" + w.getHour() + "点 不行了，睡觉");
    }
}
