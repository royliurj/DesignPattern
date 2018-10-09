package com.roy.proxy.business;

public class Proxy implements GiveGift {

    Pursuit gg;

    public Proxy(SchoolGirl mm){
        gg = new Pursuit(mm);
    }

    public void giveDolls() {
        gg.giveDolls();
    }

    public void giveFlowers() {
        gg.giveFlowers();
    }

    public void giveChocolate() {
        gg.giveChocolate();
    }
}
