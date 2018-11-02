package com.roy.abstractfactorymethod.business.user;

//抽象产品User的具体实现
public class AccessUserImpl implements IUser {
    public void insert() {
        System.out.println("Access insert User");
    }

    public void getUser() {
        System.out.println("Access get user");
    }
}
