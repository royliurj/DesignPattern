package com.roy.proxy;


import com.roy.proxy.business.Proxy;
import com.roy.proxy.business.SchoolGirl;

public class ProxyApplication {

    public static void main(String[] args) {
        SchoolGirl mm = new SchoolGirl("李娇娇");

        Proxy daili = new Proxy(mm);
        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChocolate();
    }
}
