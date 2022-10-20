

package com.identify;

// POJO or Model or Bean
public class Employee {
	
	//Attribute 
	int Id;
	String empName;
	int empSalary;
	String Address;
	
	
	// Constructor 
	public Employee() {
		
	}
	
	public Employee(int id, String empName, int empSalary) {
		super();
		Id = id;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	// Getter and Setter method
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
	
	
	
	
	
	
	
	

}
