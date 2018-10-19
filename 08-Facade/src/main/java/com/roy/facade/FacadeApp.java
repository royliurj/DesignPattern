package com.roy.facade;

import com.roy.facade.business.FacadeClass;

public class FacadeApp {
    public static void main(String[] args) {
        FacadeClass facade = new FacadeClass();
        facade.methodA();
        facade.methodB();
    }
}
