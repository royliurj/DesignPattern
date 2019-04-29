package com.roy.command.business;

/**
 * 具体命令：烤鸡翅命令
 * @Author: Roy
 * @Date: 2019/4/29 14:17
 */
public class BakeChickenWingCommand extends BakeCommand {
    public BakeChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void executeBakeCommand() {
        barbecuer.bakeChickenWing();
    }

    @Override
    public String toString() {
        return "烤鸡翅";
    }
}
