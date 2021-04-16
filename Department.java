package com;

public class Department {
	private Integer depId;
	private String  depName;
	private String  depLoc;
	
	
	public Integer getDepId() {
		return depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getDepLoc() {
		return depLoc;
	}

	public void setDepLoc(String depLoc) {
		this.depLoc = depLoc;
	}

	public Department(Integer depId,String  depName,String  depLoc)
	{

	    this.depId = depId;
	    this.depName = depName;
		this.depLoc = depLoc;		
	}

	public void printDepartment(){
		System.out.println("Department id: "+depId);
		System.out.println("Department name: "+depName);
		System.out.println("Department Location: "+depLoc);
		
	}
}
