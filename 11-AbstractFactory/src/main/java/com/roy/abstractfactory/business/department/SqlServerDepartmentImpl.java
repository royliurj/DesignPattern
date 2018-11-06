package com.roy.abstractfactory.business.department;

public class SqlServerDepartmentImpl implements IDepartment {
    public void getDepatrment() {
        System.out.println("Sql server get department");
    }

    public void insertDepartment() {
        System.out.println("Sql server insert department");
    }
}
