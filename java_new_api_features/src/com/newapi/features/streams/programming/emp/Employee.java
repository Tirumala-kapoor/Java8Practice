package com.newapi.features.streams.programming.emp;

import java.util.List;

public class Employee {
	
	private long id;
	private String name;
	private double salary;
	//private List<Dept> dept;
	private List<String> dept;
	public Employee(long id, String name, double salary, List<String> dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public List<String> getDept() {
		return dept;
	}
	public void setDept(List<String> dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]\n";
	}
	
	
}
