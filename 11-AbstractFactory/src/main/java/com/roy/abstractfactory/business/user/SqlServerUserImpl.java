package com.roy.abstractfactory.business.user;

public class SqlServerUserImpl implements IUser {
    public void getUser() {
        System.out.println("Sql Server get user");
    }

    public void insertUser() {
        System.out.println("Sql server insert user");
    }
}
