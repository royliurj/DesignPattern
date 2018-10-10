package com.roy.factory.business;

public class OperationAdd extends Operation {
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
