package com.roy.abstractfactorymethod.business.user;

//抽象产品User的具体实现
public class SqlServerUserImpl implements IUser {
    public void insert() {
        System.out.println("Sql Server Insert User");
    }

    public void getUser() {
        System.out.println("Sql Server get User");
    }
}
