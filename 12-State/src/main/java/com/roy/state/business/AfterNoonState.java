package com.roy.state.business;

/**
 * @Author: Roy
 * @Date: 2019/1/21 15:09
 */
public class AfterNoonState extends State {
    @Override
    public void writeProgram(Work w) {
        if(w.getHour() < 17){
            System.out.println("当前时间：" + w.getHour() + "点 下午状态还不错，继续努力");
        } else{
            w.setState(new EveningState());
            w.writeProgram();
        }
    }
}
