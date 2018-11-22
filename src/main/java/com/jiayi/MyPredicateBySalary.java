package com.jiayi;

import com.jiayi.pojo.Employee;

/**
 * @description :
 * @author: CONCENTRATE
 * @time: 2018/10/31.
 */
public class MyPredicateBySalary implements MyPredicate<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.getSalary() > 555;
    }
}
