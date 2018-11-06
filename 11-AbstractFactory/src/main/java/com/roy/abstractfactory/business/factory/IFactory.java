package com.roy.abstractfactory.business.factory;

import com.roy.abstractfactory.business.department.IDepartment;
import com.roy.abstractfactory.business.user.IUser;

public interface IFactory {
    IUser createUser();
    IDepartment createDepartment();
}
