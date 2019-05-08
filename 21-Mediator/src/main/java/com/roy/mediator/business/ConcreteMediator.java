package com.roy.mediator.business;

/**
 * 具体中介者
 * @Author: Roy
 * @Date: 2019/5/8 16:15
 */
public class ConcreteMediator extends Mediator {
    private ConcreteColleagueA colleagueA;
    private ConcreteColleagueB colleagueB;

    public ConcreteColleagueA getColleagueA() {
        return colleagueA;
    }

    public ConcreteColleagueB getColleagueB() {
        return colleagueB;
    }

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if(colleague == colleagueA){
            colleagueB.notify(message);
        } else {
            colleagueA.notify(message);
        }
    }
}
