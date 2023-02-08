package com.newapi.features.streams.programming.emp;

import java.util.Comparator;
import java.util.List;

public class SecondHighestSalOfEmployee {

	public static void main(String[] args) {

		List<Employee> employees = EmployeeDatabase.getEmployee();
		System.out.println(employees);
		
		double secondHighSal = employees.stream()
		.map(e -> e.getSalary())
		.sorted(Comparator.reverseOrder())
		.skip(1)
		.findFirst().get().doubleValue();
		
		System.out.println(secondHighSal);
		//Print the name of employee with second highest salary
		employees.stream()
		.filter(e->e.getSalary() == secondHighSal)
		.forEach(e-> System.out.print(e.getName()));
		
		
		employees.stream().filter(e-> e.getSalary() > 15000)
		.forEach(e-> System.out.println(e.getName()));
		
		//Hightest salary
		Double highSal = employees.stream()
		.map(e->e.getSalary())
		.max(Double::compare).get();
		
		employees.stream().filter(e->e.getSalary() == highSal)
		.forEach(e -> System.out.print(e.getName()));
		
	}

}
