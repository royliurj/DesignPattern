package com.roy.observer;

import com.roy.observer.business.*;

public class ObserverApp {

    public static void main(String[] args) {

        SecretarySubject subject = new SecretarySubject();
        subject.attach(new StockObserver("张三",subject));
        subject.attach(new StockObserver("李四",subject));
        subject.attach(new NBAObserver("王五",subject));

        subject.setSubjectState("老板回来了");

        subject.notifyObserver();


//        Subject subject2 = new BossSubject();
//        subject2.attach(new StockObserver("张三",subject2));
//        subject2.attach(new StockObserver("李四",subject2));
//        subject2.attach(new NBAObserver("王五",subject2));
//
//        subject2.setSubjectState("我胡汉三回来了");
//
//        subject2.notifyObserver();
    }
}
