package com.roy.simplefactory.business;

public class OperationFactory {
    public static Operation createOperate(String operate){
        Operation oper = null;
        if("+".equals(operate)){
            oper = new OperationAdd();
        }else if("-".equals(operate)){
            oper = new OperationSub();
        }else if("*".equals(operate)){
            oper = new OperationMul();
        }else if("/".equals(operate)){
            oper = new OperationDiv();
        }
        return oper;
    }
}
