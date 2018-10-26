package com.roy.builder;

import com.roy.builder.business.*;

public class BuilderApp {

    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new ConcreteBuilderA();
        Builder b2 = new ConcreteBuilderB();

        director.Construct(b1);
        Product p1 = b1.getProduct();
        p1.show();

        director.Construct(b2);
        Product p2 = b2.getProduct();
        p2.show();
    }
}
