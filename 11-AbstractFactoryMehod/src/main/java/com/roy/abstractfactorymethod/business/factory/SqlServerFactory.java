package com.roy.abstractfactorymethod.business.factory;

import com.roy.abstractfactorymethod.business.department.IDepartment;
import com.roy.abstractfactorymethod.business.department.SqlServerDeptImpl;
import com.roy.abstractfactorymethod.business.user.IUser;
import com.roy.abstractfactorymethod.business.user.SqlServerUserImpl;

public class SqlServerFactory implements IFactory {
    public IUser createUser() {
        return new SqlServerUserImpl();
    }

    public IDepartment createDept() {
        return new SqlServerDeptImpl();
    }
}
