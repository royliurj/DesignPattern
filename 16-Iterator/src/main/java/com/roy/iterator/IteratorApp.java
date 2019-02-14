package com.roy.iterator;

import com.roy.iterator.business.Aggregate;
import com.roy.iterator.business.ConcreteAggregate;
import com.roy.iterator.business.Iterator;

/**
 * @Author: Roy
 * @Date: 2019/2/14 16:34
 */
public class IteratorApp {
    public static void main(String[] args) {
        Aggregate list = new ConcreteAggregate();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
