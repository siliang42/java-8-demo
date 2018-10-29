package com.jiayi;

import com.jiayi.pojo.Employee;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description :
 * @author: CONCENTRATE
 * @time: 2018/10/29.
 */
public class Java8Demo {

    /**
     *匿名内部类
     */
    /*@Test
    public void test01(){
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        TreeSet<Integer> ts= new TreeSet<Integer>(com);

    }*/


    //Lambda expression

    /**
     *
     * @Test
     *   public void test02(){
     *   Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
     *   TreeSet<Integer> ts = new TreeSet<Integer>();
     *   }
     */



    //Demand : get employees whose age more than 35
    public List<Employee> filterEmployees(List<Employee> list){
        List<Employee> emps1 = new ArrayList<>();

        for (Employee employee : list) {
            if(employee.getAge() > 35){
                emps1.add(employee);
            }

        }

        return  emps1;
    }

    @Test
    public void test03(){
        List<Employee> employees = Arrays.asList(
                new Employee("zhangsan", 18, 999.99),
                new Employee("lisi", 20, 999.99),
                new Employee("wantgwu", 50, 999.99),
                new Employee("zhaoliu", 40, 999.99),
                new Employee("tianqi", 35, 999.99)
        );
        List<Employee> emps = filterEmployees(employees);
        String s = GsonUtil.toJson(emps);
        System.out.printf(s);
    }

}
