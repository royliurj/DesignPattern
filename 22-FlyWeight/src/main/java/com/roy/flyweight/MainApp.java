package com.roy.flyweight;

import com.roy.flyweight.business.IgoChessman;
import com.roy.flyweight.business.IgoChessmanFactory;

/**
 * @Author: Roy
 * @Date: 2019/5/9 16:38
 */
public class MainApp {
    public static void main(String[] args) {
        //“abc”是放在常量池（constant pool）中的，所以，虽然a,b都等于“abc”，但是内存中只有一份副本，所以“==”的结果为true
        String a = "abc";
        String b = "abc";

        System.out.println(a==b);
        System.out.println(a.equals(b));

        IgoChessman black1,black2,black3,white1,white2;
        IgoChessmanFactory factory;

        //获取享元工厂对象
        factory = IgoChessmanFactory.getInstance();

        //通过享元工厂获取三颗黑子
        black1 = factory.getIgoChessman("b");
        black2 = factory.getIgoChessman("b");
        black3 = factory.getIgoChessman("b");
        System.out.println("判断两颗黑子是否相同：" + (black1==black2));

        //通过享元工厂获取两颗白子
        white1 = factory.getIgoChessman("w");
        white2 = factory.getIgoChessman("w");
        System.out.println("判断两颗白子是否相同：" + (white1==white2));

        //显示棋子
        black1.display();
        black2.display();
        black3.display();
        white1.display();
        white2.display();
    }
}
