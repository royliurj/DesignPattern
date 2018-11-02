package com.roy.abstractfactorymethod.business.factory;

import com.roy.abstractfactorymethod.business.department.IDepartment;
import com.roy.abstractfactorymethod.business.user.IUser;

public interface IFactory {
    IUser createUser();
    IDepartment createDept();
}
