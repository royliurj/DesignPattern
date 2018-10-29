package com.roy.observer.delegate;

import com.roy.observer.business.Observer;

public class StockObserver {
    public void beginStock(){
        System.out.println("我开始看股票");
    }

    public void stopStock(){
        System.out.println("老板回来了，停止看股票");
    }
}
