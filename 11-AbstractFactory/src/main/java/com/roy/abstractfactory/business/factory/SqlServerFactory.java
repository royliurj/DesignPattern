package com.roy.abstractfactory.business.factory;

import com.roy.abstractfactory.business.department.IDepartment;
import com.roy.abstractfactory.business.department.SqlServerDepartmentImpl;
import com.roy.abstractfactory.business.user.IUser;
import com.roy.abstractfactory.business.user.SqlServerUserImpl;

public class SqlServerFactory implements IFactory {
    public IUser createUser() {
        return new SqlServerUserImpl();
    }

    public IDepartment createDepartment() {
        return new SqlServerDepartmentImpl();
    }
}
