package com.roy.abstractfactory.business.simplefactory;

import com.roy.abstractfactory.business.department.IDepartment;
import com.roy.abstractfactory.business.user.IUser;

public class DataAccess {

    private static String database = "Access";

    public static IUser createUser() {
        try {
            IUser user = null;
            String classPath = "com.roy.abstractfactory.business.user." + database + "UserImpl";

            Class clazz = Class.forName(classPath);
            user = (IUser) clazz.newInstance();

            return user;
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }
    public static IDepartment createDepartment() {
        try {

            IDepartment user = null;

            String classPath = "com.roy.abstractfactory.business.department." + database + "DepartmentImpl";

            Class clazz = Class.forName(classPath);
            user = (IDepartment) clazz.newInstance();

            return user;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
