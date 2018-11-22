package com.jiayi;

import com.jiayi.pojo.Employee;
import com.sun.xml.internal.bind.v2.model.core.MaybeElement;

/**
 * @description :
 * @author: CONCENTRATE
 * @time: 2018/10/31.
 */
public class MyPredicateByAge implements MyPredicate<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.getAge() > 35;
    }
}
