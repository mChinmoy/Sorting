package com.chinmoy.client;

import com.chinmoy.domain.*;
import org.junit.jupiter.api.Test;

import java.util.*;

public class Main {
    public static void main(String args[]) {
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


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select a sorting option:");
        System.out.println("1 - Sort by age");
        System.out.println("2 - Sort by first name");
        System.out.println("3 - Sort by last name");
        int choice = scanner.nextInt();

        if (choice == 1) {
            Collections.sort(employees, Comparator.comparing(Employee::getAge));

        } else if (choice == 2) {
            Collections.sort(employees, Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName));
        }
        else if (choice == 3) {
            Collections.sort(employees, Comparator.comparing(Employee::getLastName).thenComparing(Employee::getFirstName));
        } else if (choice == 0) {
            System.out.println("Exiting program.");
            return;


        }

        else {
            System.out.println("Invalid choice!");
            return;
        }

        // Display the sorted list of employees
        for (Employee employee : employees) {
            System.out.println(employee);
        }




    }
}
