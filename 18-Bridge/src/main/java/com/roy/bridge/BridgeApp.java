package com.roy.bridge;

import com.roy.bridge.business.*;

/**
 * @Author: Roy
 * @Date: 2019/2/18 15:10
 */
public class BridgeApp {
    public static void main(String[] args) {
        HandsetBrand abstraction = new HandsetBrandN();
        abstraction.setHandsetSoft(new HandsetGame());
        abstraction.run();

        abstraction.setHandsetSoft(new HandsetAddressList());
        abstraction.run();

        abstraction = new HandsetBrandM();
        abstraction.setHandsetSoft(new HandsetGame());
        abstraction.run();

        abstraction.setHandsetSoft(new HandsetAddressList());
        abstraction.run();
    }
}
