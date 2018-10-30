package com.jiayi;

import com.jiayi.pojo.Employee;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
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
    List<Employee> employees = Arrays.asList(
            new Employee("zhangsan", 18, 999.99),
            new Employee("lisi", 20, 666.66),
            new Employee("wantgwu", 50, 555.55),
            new Employee("zhaoliu", 40, 777.77),
            new Employee("tianqi", 35, 333.33)
    );


    //Demand : get employees whose age more than 35
    public List<Employee> filterEmployeesAgeMoreThan35(List<Employee> list){
        List<Employee> emps1 = new ArrayList<>();

        for (Employee employee : list) {
            if(employee.getAge() > 35){
                emps1.add(employee);
            }

        }

        return  emps1;
    }

    //Demand : get employees whose age more than 35
    public List<Employee> filterEmployeesSalaryMoreThan555(List<Employee> list){
        List<Employee> emps1 = new ArrayList<>();

        for (Employee employee : list) {
            if(employee.getSalary()> 555){
                emps1.add(employee);
            }

        }

        return  emps1;
    }

    public List<Employee> filterEmployee(List<Employee> list, MyPredicate<Employee> myPredicate){
        List<Employee> emps = new ArrayList<>();

        for (Employee employee : list) {
            if(myPredicate.test(employee)){
                emps.add(employee);
            }
        }
        return  emps;
    }

    @Test
    public void test03(){

        List<Employee> emps = filterEmployeesAgeMoreThan35(employees);
        String s = GsonUtil.toJson(emps);
        System.out.printf(s);
    }
    @Test
    public void test04(){
        List<Employee> emps = filterEmployeesSalaryMoreThan555(employees);
        String s = GsonUtil.toJson(emps);
        System.out.printf(s);
    }

    @Test
    public void test05(){
        List<Employee> emps = filterEmployee(employees, new MyPredicateByAge());
        String s = GsonUtil.toJson(emps);
        System.out.printf(s);
    }
    @Test
    public void test06(){
        List<Employee> emps = filterEmployee(employees, new MyPredicateBySalary());
        String s = GsonUtil.toJson(emps);
        System.out.printf(s);
    }

}
