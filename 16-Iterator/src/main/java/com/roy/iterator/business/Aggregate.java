package com.roy.iterator.business;

/**
 * @Author: Roy
 * @Date: 2019/2/14 16:37
 */
public interface Aggregate {
    void add(Object object);
    Object get(int index);
    Iterator iterator();
    int getSize();
}
