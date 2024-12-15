package com.lakshmipriya_s.assignment;

import com.lakshmipriya_s.assignment.employees.*;
import com.lakshmipriya_s.assignment.utilities.*;

public class AssignmentMain {

	public static void main(String[] args) {
		// Creating Manager instance
        Manager manager = new Manager();
        manager.setName("John Doe");
        manager.setEmployeeId(101);
        manager.setSalary(75000);
        manager.setDepartment("Sales");

        // Creating Developer instance
        Developer developer = new Developer();
        developer.setName("Jane Smith");
        developer.setEmployeeId(102);
        developer.setSalary(65000);
        developer.setProgrammingLanguage("Java");

        // Using EmployeeUtilities
        EmployeeUtilities utilities = new EmployeeUtilities();

        System.out.println("Manager Details:");
        utilities.printEmployeeDetails(manager);
        System.out.println("Department: " + manager.getDepartment());

        System.out.println("\nDeveloper Details:");
        utilities.printEmployeeDetails(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());

	}

}
