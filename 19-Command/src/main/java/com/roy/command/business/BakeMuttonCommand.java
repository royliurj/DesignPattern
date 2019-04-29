package com.roy.command.business;

/**
 * 具体命令：烤羊肉串命令
 * @Author: Roy
 * @Date: 2019/4/29 14:16
 */
public class BakeMuttonCommand extends BakeCommand {

    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void executeBakeCommand() {
        barbecuer.bakeMutton();
    }

    @Override
    public String toString() {
        return "烤羊肉串";
    }
}
