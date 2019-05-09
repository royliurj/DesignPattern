package com.roy.flyweight.business;

/**
 * 黑色棋子类：具体享元类
 * @Author: Roy
 * @Date: 2019/5/9 17:05
 */
public class WhiteIgoChessman extends IgoChessman {
    @Override
    public String getColor() {
        return "白色";
    }
}
