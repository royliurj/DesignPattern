package com.roy.iterator.business;

/**
 * @Author: Roy
 * @Date: 2019/2/14 16:38
 */
public class ConcreteIterator implements Iterator {

    private Aggregate aggregate = null;
    private int index;

    public ConcreteIterator(Aggregate list) {
        this.aggregate = list;
    }

    public boolean hasNext() {
        if(index >= aggregate.getSize()){
            return false;
        } else {
            return true;
        }
    }

    public Object next() {
        Object object = aggregate.get(index);
        index++;
        return object;
    }
}
