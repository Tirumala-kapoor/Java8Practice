package com.newapi.features.streams.programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3);
		
		Set<Integer> dupNum = numbers.stream()
				.filter(e -> Collections.frequency(numbers, e)>1)
				.collect(Collectors.toSet());
		System.out.println(dupNum);
		
		Set<Integer> dupNumSet = new HashSet<>();
		Set<Integer> dupNum2 = numbers.stream()
				.filter(e -> !dupNumSet.add(e))
				.collect(Collectors.toSet());
		
		System.out.println(dupNum2);

	}

}
