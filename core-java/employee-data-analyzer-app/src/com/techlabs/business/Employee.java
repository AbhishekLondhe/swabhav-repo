package com.techlabs.business;

public class Employee implements Comparable<Employee> {

	private int empId;
	private String empName;
	private String empDesignation;
	private double managerId;
	private String dateOfJoining;
	private double salary;
	private double commission;
	private int departmentNumber;

	public Employee() {
		
	}
	
	public Employee(int empId, String empName, String empDesignation, double managerId, String dateOfJoining,
			double salary, double commission, int departmentNumber) {
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.managerId = managerId;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.commission = commission;
		this.departmentNumber = departmentNumber;
	}

	@Override
	public String toString() {
		return "id:" + empId + " name:" + empName + " designation:" + empDesignation + " manager id:" + managerId
				+ " date of joining:" + dateOfJoining + " salary:" + salary + " commission:" + commission
				+ " dept number:" + departmentNumber;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public double getManagerId() {
		return managerId;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public double getCommission() {
		return commission;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		else if (o == null || this.getClass() != o.getClass())
			return false;
		Employee emp = (Employee) o;
		return (this.getEmpId() == emp.getEmpId() && this.getManagerId() == emp.getManagerId());
	}

	
	@Override
	public int hashCode() {
		return empId;
	}
	@Override
	public int compareTo(Employee o) {

		return this.getEmpId()-o.getEmpId();
	}
}
