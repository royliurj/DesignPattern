package com.roy.command.business;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker : 服务员
 * @Author: Roy
 * @Date: 2019/4/29 14:18
 */
public class Waiter {
    private List<BakeCommand> orders = new ArrayList<BakeCommand>();

    public void setOrder(BakeCommand command){
        orders.add(command);
        System.out.println("增加订单：" + command.toString());
    }

    public void cancelOrder(BakeCommand command){
        orders.remove(command);
        System.out.println("取消订单：" + command.toString());
    }

    public void notifyBake(){
        for (BakeCommand command : orders) {
            command.executeBakeCommand();
        }
    }
}
