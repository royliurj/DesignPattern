package com.roy.abstractfactory.business.user;

public class AccessUserImpl implements IUser {
    public void getUser() {
        System.out.println("Access get user");
    }

    public void insertUser() {
        System.out.println("Access insert user");
    }
}
