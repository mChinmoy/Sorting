package com.chinmoy.domain;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

    private List<Employee> employees;

    @Before
    public void setUp() {
        employees = new ArrayList<>();
        employees.add(new Employee(1, "John", "Doe", 20));
        employees.add(new Employee(2, "Bob", "Lee", 25));
        employees.add(new Employee(3, "John", "Watson", 28));
        employees.add(new Employee(4, "Cindy", "Smith", 30));
    }

    @Test
    public void testSortByAge() {
        List<Employee> expected = new ArrayList<>();
        expected.add(new Employee(1, "John", "Doe", 20));
        expected.add(new Employee(2, "Bob", "Lee", 25));
        expected.add(new Employee(3, "John", "Watson", 28));
        expected.add(new Employee(4, "Cindy", "Smith", 30));

        assertEquals(expected, employees);
    }

    @Test
    public void testSortByFirstName() {
        List<Employee> expected = new ArrayList<>();
        expected.add(new Employee(1, "John", "Doe", 20));
        expected.add(new Employee(2, "Bob", "Lee", 25));
        expected.add(new Employee(3, "John", "Watson", 28));
        expected.add(new Employee(4, "Cindy", "Smith", 30));


        assertEquals(expected, employees);
    }

    @Test
    public void testSortByLastName() {
        List<Employee> expected = new ArrayList<>();
        expected.add(new Employee(1, "John", "Doe", 20));
        expected.add(new Employee(2, "Bob", "Lee", 25));
        expected.add(new Employee(3, "John", "Watson", 28));
        expected.add(new Employee(4, "Cindy", "Smith", 30));

        assertEquals(expected, employees);
    }

}
