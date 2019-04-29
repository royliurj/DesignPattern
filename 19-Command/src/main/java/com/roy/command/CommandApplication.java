package com.roy.command;

import com.roy.command.business.*;

/**
 * @Author: Roy
 * @Date: 2019/4/29 14:12
 */
public class CommandApplication {
    public static void main(String[] args) {
        //烤肉师傅
        Barbecuer boy = new Barbecuer();
        BakeCommand cmd1 = new BakeMuttonCommand(boy);
        BakeCommand cmd2 = new BakeMuttonCommand(boy);
        BakeCommand cmd3 = new BakeChickenWingCommand(boy);

        Waiter girl = new Waiter();
        girl.setOrder(cmd1);
        girl.setOrder(cmd2);
        girl.setOrder(cmd3);

        girl.cancelOrder(cmd2);

        girl.notifyBake();
    }
}
