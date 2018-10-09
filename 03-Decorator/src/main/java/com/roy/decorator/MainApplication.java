package com.roy.decorator;

import com.roy.decorator.business2.BigTrouser;
import com.roy.decorator.business2.Person;
import com.roy.decorator.business2.Sneakers;
import com.roy.decorator.business2.TShirts;
import com.roy.decorator.businiess.ConcreteComponent;
import com.roy.decorator.businiess.ConcreteDecoratorA;
import com.roy.decorator.businiess.ConcreteDecoratorB;

public class MainApplication {

    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();
        d1.setComponent(c);
        d2.setComponent(d1);

        d2.operation();

        Person xc = new Person("小菜");

        System.out.println("第一种装扮");
        Sneakers p1 = new Sneakers();
        BigTrouser p2 = new BigTrouser();
        TShirts p3 = new TShirts();

        p1.Decorate(xc);
        p2.Decorate(p1);
        p3.Decorate(p2);
        p3.show();
    }
}
