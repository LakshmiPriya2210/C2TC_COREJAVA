package com.lakshmipriya_s.assignment.utilities;

import com.lakshmipriya_s.assignment.employees.*;

public class EmployeeUtilities {
	//Prints the details of an Employee
	public void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }
}
