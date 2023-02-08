package com.newapi.features.streams.programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(2,32,222,24,567,890,776,23,211,432,22,-21);
		System.out.println("Actual : "+numbers);
		List<Integer> sorted = numbers.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println("Asc order : "+sorted);
		
		List<Integer> sortedDesc = numbers.stream()
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println("Desc order : "+sortedDesc);
	}

}
