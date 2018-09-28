package com.roy.simplefactory;

import com.roy.simplefactory.business.Operation;
import com.roy.simplefactory.business.OperationFactory;

public class MainApplication {

    public static void main(String[] args) throws Exception {

        String strOper = "+";
        double numA = 1;
        double numB = 2;

        Operation oper = OperationFactory.createOperate(strOper);
        oper.setNumberA(numA);
        oper.setNumberB(numB);
        double result = oper.getResult();

        System.out.printf("%s%s%s=%s",numA,strOper,numB,result);
    }
}
