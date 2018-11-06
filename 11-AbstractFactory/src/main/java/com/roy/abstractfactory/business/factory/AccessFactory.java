package com.roy.abstractfactory.business.factory;

import com.roy.abstractfactory.business.department.AccessDepartmentImpl;
import com.roy.abstractfactory.business.department.IDepartment;
import com.roy.abstractfactory.business.user.AccessUserImpl;
import com.roy.abstractfactory.business.user.IUser;

public class AccessFactory implements IFactory {
    public IUser createUser() {
        return new AccessUserImpl();
    }

    public IDepartment createDepartment() {
        return new AccessDepartmentImpl();
    }
}
