package com.roy.iterator.business;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Roy
 * @Date: 2019/2/14 16:39
 */
public class ConcreteAggregate implements Aggregate {

    private Object[] list;
    private int size = 0;
    private int index = 0;

    public ConcreteAggregate() {
        index = 0;
        size = 0;
        list = new Object[100];
    }

    public void add(Object object) {
        list[index++] = object;
        size++;
    }

    public Object get(int index) {
        return list[index];
    }

    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    public int getSize() {
        return size;
    }
}
