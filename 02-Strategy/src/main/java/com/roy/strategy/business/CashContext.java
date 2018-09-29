package com.roy.strategy.business;
//策略与简单工厂结合
//策略上下文
public class CashContext {
    CashSuper cs = null;

    //简单工厂
    public CashContext(String type){
        if("正常收费".equals(type)){
            cs = new CashNormal();
        }else if("满300返100".equals(type)){
            cs = new CashReturn("300","100");
        }else if("打8折".equals(type)){
            cs = new CashRebate("0.8");
        }
    }

    public double getResult(double money){
        return cs.acceptCash(money);
    }
}
