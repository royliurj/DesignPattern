package com.roy.adapter;

import com.roy.adapter.business.Center;
import com.roy.adapter.business.Player;
import com.roy.adapter.business.Translator;

/**
 * @Author: Roy
 * @Date: 2019/1/28 16:18
 */
public class AdapterApp {
    public static void main(String[] args) {
        Player center = new Center("中锋1");
        center.attack();

        Player foreignCenter = new Translator("姚明");
        foreignCenter.attack();
        foreignCenter.defense();
    }
}
