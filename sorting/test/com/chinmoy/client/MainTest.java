package com.chinmoy.client;

import com.chinmoy.domain.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainTest {

    @Test
    public void testSortByAge() {
        Employee e1 = new Employee(1, "Rajib", "Bhatt", 28);
        Employee e2 = new Employee(2, "Jane", "Williams", 26);
        Employee e3 = new Employee(3, "Adam", "Smith", 32);
        Employee e4 = new Employee(4, "Emily", "Jones", 24);
        Employee e5 = new Employee(5, "Emily", "Bhatt", 29);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        Collections.sort(employees, Comparator.comparing(Employee::getAge));

        List<Employee> expected = new ArrayList<>();
        expected.add(e4);
        expected.add(e2);
        expected.add(e1);
        expected.add(e5);
        expected.add(e3);

        Assertions.assertEquals(expected, employees);
    }

    @Test
    public void testSortByFirstName() {
        Employee e1 = new Employee(1, "Rajib", "Bhatt", 28);
        Employee e2 = new Employee(2, "Jane", "Williams", 26);
        Employee e3 = new Employee(3, "Adam", "Smith", 32);
        Employee e4 = new Employee(4, "Emily", "Jones", 24);
        Employee e5 = new Employee(5, "Emily", "Bhatt", 29);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        Collections.sort(employees, Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName));

        List<Employee> expected = new ArrayList<>();
        expected.add(e3);
        expected.add(e5);
        expected.add(e4);
        expected.add(e2);
        expected.add(e1);

        Assertions.assertEquals(expected, employees);
    }

    @Test
    public void testSortByLastName() {
        Employee e1 = new Employee(1, "Rajib", "Bhatt", 28);
        Employee e2 = new Employee(2, "Jane", "Williams", 26);
        Employee e3 = new Employee(3, "Adam", "Smith", 32);
        Employee e4 = new Employee(4, "Emily", "Jones", 24);
        Employee e5 = new Employee(5, "Emily", "Bhatt", 29);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        Collections.sort(employees, Comparator.comparing(Employee::getLastName).thenComparing(Employee::getFirstName));

        List<Employee> expected = new ArrayList<>();
        expected.add(e5);
        expected.add(e1);
        expected.add(e4);
        expected.add(e3);
        expected.add(e2);

        Assertions.assertEquals(expected, employees);
    }

}