package com.roy.decorator.businiess;

public class ConcreteDecoratorA extends Decorator{

    //独有的功能
    private String addedState;

    @Override
    public void operation() {
        super.operation();
        addedState = "New State";
        System.out.println("Set AddedState");
        System.out.println("具体装饰类A的操作");
    }
}
