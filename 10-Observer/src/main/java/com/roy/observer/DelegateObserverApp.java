package com.roy.observer;

import com.roy.observer.delegate.NBAObserver;
import com.roy.observer.delegate.SecretarySubject;
import com.roy.observer.delegate.StockObserver;
import com.roy.observer.delegate.Subject;

public class DelegateObserverApp {
    public static void main(String[] args) {
        Subject subject = new SecretarySubject();

        StockObserver stockObserver = new StockObserver();
        NBAObserver nbaObserver = new NBAObserver();

        //告诉MM，老板来了告诉我一下
        subject.addListener(stockObserver,"stopStock",null);

        subject.addListener(nbaObserver,"stopNBA",null);

        subject.notifyX();

    }
}
