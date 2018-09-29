package com.roy.strategy.business;

//返利子类
public class CashReturn extends CashSuper {
    double moneyCondition = 0.0d;
    double moneyReturn = 0.0;

    public CashReturn(String moneyCondition, String moneyReturn){
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    double acceptCash(double money) {
        double result = money;
        if(money >= moneyCondition){
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
