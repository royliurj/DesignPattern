package com.roy.abstractfactorymethod.business.department;

public class SqlServerDeptImpl implements IDepartment {
    public void insert() {
        System.out.println("Sql server insert department");
    }

    public void getDept() {
        System.out.println("Sql server get department");
    }
}
