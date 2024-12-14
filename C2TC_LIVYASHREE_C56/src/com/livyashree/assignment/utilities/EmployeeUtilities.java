package com.livyashree.assignment.utilities;
import com.livyashree.assignment.employees.Employee;

	public class EmployeeUtilities {

	    public static void displayEmployeeInfo(Employee employee) {
	        System.out.println("Name: " + employee.getName());
	        System.out.println("Employee ID: " + employee.getEmployeeId());
	        System.out.println("Salary: " + employee.getSalary());
	    }

	    public static void updateEmployeeSalary(Employee employee, double newSalary) {
	        employee.setSalary(newSalary);
	        System.out.println("Updated Salary: " + employee.getSalary());
	    }
	}


