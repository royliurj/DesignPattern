package com.roy.factory.business;


public class OperationAddFactory implements IOperationFactory {
    public Operation createOperation() {
        return new OperationAdd();
    }
}
