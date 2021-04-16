package com;

public class Employee {
	private int empId;
	private String empName;
	private double sal;
	private String email;
	
	public Employee(int empId, String empName, double sal, String email)
	{
	       this.empId = empId;
	       this.empName = empName;
	       this.sal = sal;
	       this.email = email;
		
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void printEmployee(){
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(sal);
		System.out.println(email);
	}
}
