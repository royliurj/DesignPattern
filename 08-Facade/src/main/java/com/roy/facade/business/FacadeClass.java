package com.roy.facade.business;

public class FacadeClass {

    SubSystemOne subSystemOne;
    SubSystemTwo subSystemTwo;

    public FacadeClass(){
        this.subSystemOne = new SubSystemOne();
        this.subSystemTwo = new SubSystemTwo();
    }

    public void methodA(){
        subSystemTwo.methodTwo();
        subSystemOne.methodOne();
    }

    public void methodB(){
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
    }
}
