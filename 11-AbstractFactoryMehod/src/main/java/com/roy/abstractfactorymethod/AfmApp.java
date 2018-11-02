package com.roy.abstractfactorymethod;

import com.roy.abstractfactorymethod.business.factory.AccessFactory;
import com.roy.abstractfactorymethod.business.factory.IFactory;
import com.roy.abstractfactorymethod.business.user.IUser;

public class AfmApp {
    public static void main(String[] args) {

        IFactory factory = new AccessFactory();
        IUser user = factory.createUser();
        user.insert();
        user.getUser();
    }
}
