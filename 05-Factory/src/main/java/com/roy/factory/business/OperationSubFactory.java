package com.roy.factory.business;

public class OperationSubFactory implements IOperationFactory {
    public Operation createOperation() {
        return new OperationSub();
    }
}
