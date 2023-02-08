package com.newapi.features.streams.programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOrOddNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(11,2,3,45,67,9,90,87,8,3);
		
		List<Integer> evenNum = numbers.stream()
				.filter(e-> e % 2 == 0)
				.collect(Collectors.toList());
		
		System.out.println("Even Numbers  : "+evenNum);
		
		List<Integer> oddNum = numbers.stream()
									.filter(e->e%2 != 0)
									.collect(Collectors.toList());
		
		System.out.println("Odd Numbers : "+oddNum);
				
	}

}
