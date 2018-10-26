package com.roy.builder.business;

import java.util.ArrayList;
import java.util.List;

public class Product {

    List<String> parts = new ArrayList<String>();

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        System.out.println("构建的产品：");
        for (String part: parts) {
            System.out.println(part);
        }
    }
}
