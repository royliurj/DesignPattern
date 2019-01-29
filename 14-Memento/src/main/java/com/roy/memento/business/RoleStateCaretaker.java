package com.roy.memento.business;

/**
 * 角色状态管理者
 * @Author: Roy
 * @Date: 2019/1/29 17:01
 */
public class RoleStateCaretaker {
    private RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }
}
