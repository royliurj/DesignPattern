package com.roy.decorator.businiess;

public class ConcreteDecoratorB extends Decorator{

    @Override
    public void operation() {
        super.operation();
        addBehavior();
        System.out.println("具体装饰类B的操作");
    }

    //独有的行为
    private void addBehavior(){
        System.out.println("addBehavior");
    }
}
