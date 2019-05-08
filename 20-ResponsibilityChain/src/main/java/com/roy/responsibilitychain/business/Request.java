package com.roy.responsibilitychain.business;

/**
 * 请求主体
 * @Author: Roy
 * @Date: 2019/5/5 17:03
 */
public class Request {
    private String requestType;
    private int requestNumber;

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public int getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber(int requestNumber) {
        this.requestNumber = requestNumber;
    }
}
