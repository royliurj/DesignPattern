package com.roy.builder.business;

public class Director {
    public void Construct(Builder builder){
        builder.buildHead();
        builder.buildFoot();
    }
}
