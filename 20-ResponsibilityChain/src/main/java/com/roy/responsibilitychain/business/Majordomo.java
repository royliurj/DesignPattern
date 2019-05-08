package com.roy.responsibilitychain.business;

/**
 * @Author: Roy
 * @Date: 2019/5/5 17:05
 */
public class Majordomo extends Manager {
    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if(request.getRequestType() == "请假" && request.getRequestNumber() <= 5){
            System.out.println(name + ": 批准" + request.getRequestType() + request.getRequestNumber());
        } else{
            if(superior != null){
                superior.requestApplications(request);
            }
        }
    }
}
