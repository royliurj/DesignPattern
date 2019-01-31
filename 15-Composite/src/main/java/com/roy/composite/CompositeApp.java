package com.roy.composite;

import com.roy.composite.busines.ConcreteCompany;
import com.roy.composite.busines.FinanceDepartment;
import com.roy.composite.busines.HRDepartment;

/**
 * @Author: Roy
 * @Date: 2019/1/31 15:04
 */
public class CompositeApp {
    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany comp = new ConcreteCompany("上海华东分公司");
        comp.add(new HRDepartment("华东分公司人力资源部"));
        comp.add(new FinanceDepartment("华东分公司财务部"));
        root.add(comp);

        ConcreteCompany comp1 = new ConcreteCompany("南京办事处");
        comp1.add(new HRDepartment("南京办事处人力资源部"));
        comp1.add(new FinanceDepartment("南京办事处财务部"));
        comp.add(comp1);

        root.display(1);
        root.lineOfDuty();
    }
}
