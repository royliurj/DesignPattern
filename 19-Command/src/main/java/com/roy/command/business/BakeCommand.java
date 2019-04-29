package com.roy.command.business;

/**
 * 抽象命令
 * @Author: Roy
 * @Date: 2019/4/29 14:12
 */
public abstract class BakeCommand {
    protected final Barbecuer barbecuer;
    public BakeCommand(Barbecuer barbecuer){
        this.barbecuer = barbecuer;
    }

    public abstract void executeBakeCommand();
}
