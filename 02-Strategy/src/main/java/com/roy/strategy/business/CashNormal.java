package com.roy.strategy.business;

//正常收费
public class CashNormal extends CashSuper {
    double acceptCash(double money) {
        return money;
    }
}
