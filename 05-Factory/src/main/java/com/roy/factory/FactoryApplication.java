package com.roy.factory;

import com.roy.factory.business.IOperationFactory;
import com.roy.factory.business.Operation;
import com.roy.factory.business.OperationAddFactory;

public class FactoryApplication {
    public static void main(String[] args) {
        IOperationFactory factory = new OperationAddFactory();
        Operation operation = factory.createOperation();
        operation.setNumberA(10);
        operation.setNumberB(20);

        System.out.println(operation.getResult());
    }
}
