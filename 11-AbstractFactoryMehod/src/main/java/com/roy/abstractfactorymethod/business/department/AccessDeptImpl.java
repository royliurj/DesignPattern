package com.roy.abstractfactorymethod.business.department;

public class AccessDeptImpl implements IDepartment {
    public void insert() {
        System.out.println("access insert department");
    }

    public void getDept() {
        System.out.println("access get department");
    }
}
