package com.roy.observer.business;

public class StockObserver extends Observer {

    private String name;
    private String observerState;
    private Subject subject;

    public StockObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    void update() {
        observerState = subject.getSubjectState();
        System.out.println(observerState + "," + name + "关闭股票行情，继续工作!");
    }
}
