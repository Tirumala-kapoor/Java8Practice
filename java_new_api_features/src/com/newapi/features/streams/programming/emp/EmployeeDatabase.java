package com.newapi.features.streams.programming.emp;

import java.util.Arrays;
import java.util.List;

public class EmployeeDatabase {
	
	public static List<Employee> getEmployee(){
		
		List<Employee> employees = Arrays.asList(
					new Employee(101, "Yadav", 60000, Arrays.asList("DEV","IT","QA")),
					new Employee(102, "Harry", 12000, Arrays.asList("IT","QA")),
					new Employee(103, "Prakash", 32000, Arrays.asList("DEV","IT")),
					new Employee(104, "Ganesh", 10000, Arrays.asList("DEV","QA")),
					new Employee(105, "Prabhu", 6000, Arrays.asList("DEV","IT","QA")));
		return employees;
	}

}
