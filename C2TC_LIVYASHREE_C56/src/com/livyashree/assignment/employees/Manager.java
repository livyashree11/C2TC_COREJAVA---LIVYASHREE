package com.livyashree.assignment.employees;

	public class Manager extends Employee {
	    private String department;

	    // Constructor
	    public Manager(String name, int employeeId, double salary, String department) {
	        super(name, employeeId, salary);
	        this.department = department;
	    }

	    // Getter and Setter for department
	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }
	}



