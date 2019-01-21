package com.roy.state.business;

/**
 * @Author: Roy
 * @Date: 2019/1/21 15:10
 */
public class EveningState extends State {
    @Override
    public void writeProgram(Work w) {
        if(w.isFinish()){
            w.setState(new RestState());
            w.writeProgram();
        } else {
            if (w.getHour() <21) {
                System.out.println("当前时间：" + w.getHour() + "点 加班，疲劳");
            } else {
                w.setState(new SleepingState());
                w.writeProgram();
            }
        }
    }
}
