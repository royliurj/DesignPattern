package com.roy.abstractfactory;

import com.roy.abstractfactory.business.department.IDepartment;
import com.roy.abstractfactory.business.factory.AccessFactory;
import com.roy.abstractfactory.business.factory.IFactory;
import com.roy.abstractfactory.business.factory.SqlServerFactory;
import com.roy.abstractfactory.business.simplefactory.DataAccess;
import com.roy.abstractfactory.business.user.IUser;

public class AFApp {
    public static void main(String[] args) {
//        IFactory factory = new AccessFactory();

        IUser user = DataAccess.createUser();
        user.getUser();
        user.insertUser();

        IDepartment department = DataAccess.createDepartment();
        department.getDepatrment();
        department.insertDepartment();

    }
}
