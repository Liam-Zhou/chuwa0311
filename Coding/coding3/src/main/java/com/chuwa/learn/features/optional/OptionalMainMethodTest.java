package com.chuwa.learn.features.optional;

import com.chuwa.learn.common.pojos.Employee;
import org.junit.Test;

import java.util.Optional;

public class OptionalMainMethodTest {
    /**
     * https://www.youtube.com/watch?v=wOi2k4dJviM&list=PLmOn9nNkQxJH0qBIrtV6otI0Ep4o2q67A&index=684
     * of(T t) - 不可以为null
     * ofNullable(T t) - 可以为null
     * orElse(T t) - 如果当前的optional内部封装的t是非空的，则返回内部t, 如果内部的t是空的， 则返回orElse()方法中的t
     */
    @Test
    public void testOptionalWithNotHandleException() {
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.of(employee);

        employee = null;
        // of(T t) - 不可以为null
        Optional<Employee> optional1 = Optional.of(employee);
    }

    @Test(expected = NullPointerException.class)
    public void test1() {
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.of(employee);

        employee = null;
        // of(T t) - 不可以为null
        Optional<Employee> optional1 = Optional.of(employee);
    }

    @Test
    public void testOfNullable() {
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.ofNullable(employee);
        System.out.println(optional);

        employee = null;
        Optional<Employee> optional1 = Optional.ofNullable(employee);
        System.out.println(optional1);
    }

    @Test
    public void testOrElse() {
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.ofNullable(employee);
        System.out.println(optional);

        employee = null;
        Optional<Employee> optional1 = Optional.ofNullable(employee);
        System.out.println(optional1);

        /**
         * orElse是一个终结操作，它会从Optional中提取值，
         * 如果该Optional包含一个值（即非空），它就会返回这个值。
         * 如果Optional为空（即原始的value是null），那么orElse会返回它的参数
         */
        Employee employee1 = Optional.ofNullable(employee).orElse(new Employee(1, "JCole", 30, 6666));
        if (employee != null) {
            employee1 = employee;
        } else {
            employee1 = new Employee(1, "JCole", 30, 6666);
        }
        System.out.println(employee1);
    }

    @Test
    public void testOrElseThrow() {
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.ofNullable(employee);
        System.out.println(optional);

        employee = null;
        Optional<Employee> optional1 = Optional.ofNullable(employee);
        System.out.println(optional1);

        Employee employee1 = Optional.ofNullable(employee)
                                     .orElseThrow(() -> new RuntimeException("Wow Exception"));
        System.out.println(employee1);
    }
}
