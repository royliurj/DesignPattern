package com.roy.builder.business;

public class ConcreteBuilderA implements Builder {

    private Product product = new Product();

    public void buildHead() {
        product.add("小头");
    }

    public void buildFoot() {
        product.add("小脚");
    }

    public Product getProduct() {
        return product;
    }
}
