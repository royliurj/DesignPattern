package com.roy.strategy;

import com.roy.strategy.business.CashContext;

public class MainApplication {

    public static void main(String[] args) {
        CashContext context = new CashContext("打8折");
        double totalPrice = 0d;
        totalPrice = context.getResult(1000 * 2);
        System.out.println("1000*2 打8折后价格是" + totalPrice);
    }

}
