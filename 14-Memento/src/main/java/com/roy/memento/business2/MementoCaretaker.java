package com.roy.memento.business2;

import java.util.ArrayList;

/**
 * 负责人角色 MementoCaretaker
 * @Author: Roy
 * @Date: 2019/5/10 14:39
 */
public class MementoCaretaker {
    //定义一个集合来存储备忘录
    private ArrayList mementolist = new ArrayList();

    public ChessmanMemento getMemento(int i) {
        return (ChessmanMemento) mementolist.get(i);
    }

    public void addMemento(ChessmanMemento memento) {
        mementolist.add(memento);
    }
}
