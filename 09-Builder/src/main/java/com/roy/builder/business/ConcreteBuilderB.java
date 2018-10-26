package com.roy.builder.business;

public class ConcreteBuilderB implements Builder {
    private Product product = new Product();
    public void buildHead() {
        product.add("大头");
    }

    public void buildFoot() {
        product.add("大脚");
    }

    public Product getProduct() {
        return product;
    }
}
