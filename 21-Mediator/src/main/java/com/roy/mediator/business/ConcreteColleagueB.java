package com.roy.mediator.business;

/**
 * 具体同事A
 * @Author: Roy
 * @Date: 2019/5/8 16:15
 */
public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }
    public void send(String message){
        mediator.send(message, this);
    }

    public void notify(String message){
        System.out.println("同事B得到的消息：" + message);
    }
}
