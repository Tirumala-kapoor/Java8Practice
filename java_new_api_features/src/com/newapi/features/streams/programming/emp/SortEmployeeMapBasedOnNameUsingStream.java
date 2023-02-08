package com.newapi.features.streams.programming.emp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map.Entry;

public class SortEmployeeMapBasedOnNameUsingStream {
	public static void main(String[] args) {
		
		Map<Integer, Employee> empIdAndNameMap = new HashMap<>();
		empIdAndNameMap.put(12301, new Employee(12301, "Sean", 30000.0, Arrays.asList("IT")));
		empIdAndNameMap.put(12303, new Employee(12303, "Abhay", 90000.0, Arrays.asList("Finance")));
		empIdAndNameMap.put(10304, new Employee(10304, "West", 20000.0, Arrays.asList("Admin")));
		empIdAndNameMap.put(10005, new Employee(10005, "Sam", 40000.0, Arrays.asList("Finance")));
		empIdAndNameMap.put(11106, new Employee(11106, "Frank", 10000.0, Arrays.asList("Risk")));
		empIdAndNameMap.put(11009, new Employee(11009, "Lussy", 70000.0, Arrays.asList("Survillence")));
		empIdAndNameMap.put(10007, new Employee(10007, "Abhay", 80000.0, Arrays.asList("Asset Management")));
		
		System.out.println("Origina Map :::: ");
		empIdAndNameMap.forEach((k,v)->System.out.println(k+"\t"+v));
		
		
//		//sort Based on keys
//		Set<Entry<Integer, Employee>> entrySet = empIdAndNameMap.entrySet();
//		ArrayList<Entry<Integer, Employee>> list = new ArrayList<>(entrySet);
//		
//		Collections.sort(list, 
//				(e1,e2)->e1.getValue().getName().compareTo(e2.getValue().getName()));
//		
//		System.out.println("Sorted Map ");
//		list.forEach((e)->System.out.println(e.getKey()+"\t"+e.getValue()));
		
		LinkedHashMap<Integer, Employee> mapSortedByName = 
				empIdAndNameMap.entrySet()
								.stream()
								.sorted((e1,e2)-> e1.getValue().getName().compareTo(e2.getValue().getName()))
								.collect(Collectors.toMap(
										Map.Entry::getKey, Map.Entry::getValue, 
										//or e->e.getKey(), e->e.getValue(), 
											(e1,e2)->e1, LinkedHashMap::new));
		
		
		System.out.println("Sorted Map ::::");
		mapSortedByName.forEach((k,v)->System.out.println(k+"\t"+v));
		
		System.out.println("Sorted Map By Name and Salary::::");
		System.out.println("==================================================");
		
		LinkedHashMap<Integer, Employee> mapSortedByNameSal = empIdAndNameMap.entrySet()
				 .stream()		
				 .sorted(Map.Entry
						 .comparingByValue(Comparator.comparing(Employee::getName)
						 .thenComparingDouble(Employee::getSalary)))
				 .collect(Collectors.toMap(
										Map.Entry::getKey, Map.Entry::getValue, 
										//or e->e.getKey(), e->e.getValue(), 
											(e1,e2)->e1, LinkedHashMap::new));
			//...forEach((k,v) );
		 mapSortedByNameSal.forEach((k,v)->System.out.println(k+"\t"+v));
		 
		 System.out.println("Sorted Dept Desc::::");
			System.out.println("==================================================");
		 empIdAndNameMap.values().stream()
		 .flatMap(e->e.getDept().stream())
		 .sorted(Comparator.comparing(String::valueOf).reversed()).forEach(System.out::println);
		
	}

}
