package com.roy.strategy.business;

//打折子类
public class CashRebate extends CashSuper {

    double moneyRebate = 1d;
    public CashRebate(String moneyRebate){
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    double acceptCash(double money) {
        return money * moneyRebate;
    }
}
