package com.roy.mediator;

import com.roy.mediator.business.ConcreteColleagueA;
import com.roy.mediator.business.ConcreteColleagueB;
import com.roy.mediator.business.ConcreteMediator;

/**
 * @Author: Roy
 * @Date: 2019/5/8 16:13
 */
public class MainApp {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);

        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);

        colleagueA.send("你吃饭了吗");
        colleagueB.send("没有，你请客");
    }
}
