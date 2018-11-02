package com.roy.abstractfactorymethod.business.factory;

import com.roy.abstractfactorymethod.business.department.AccessDeptImpl;
import com.roy.abstractfactorymethod.business.department.IDepartment;
import com.roy.abstractfactorymethod.business.user.AccessUserImpl;
import com.roy.abstractfactorymethod.business.user.IUser;

public class AccessFactory implements IFactory {
    public IUser createUser() {
        return new AccessUserImpl();
    }

    public IDepartment createDept() {
        return new AccessDeptImpl();
    }
}
