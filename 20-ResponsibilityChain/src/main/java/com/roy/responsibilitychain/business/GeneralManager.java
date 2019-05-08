package com.roy.responsibilitychain.business;

/**
 * @Author: Roy
 * @Date: 2019/5/5 17:05
 */
public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType() == "请假") {
            if (request.getRequestNumber() <= 10) {
                System.out.println(name + ": 批准" + request.getRequestType() + request.getRequestNumber());
            } else {
                System.out.println("请假太长，不批准");
            }
        }
    }
}
