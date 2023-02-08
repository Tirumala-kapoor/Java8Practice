package com.newapi.features.streams.programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestLowestNumber {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,3,10,20,30,15,1,13,2,2,10,30,19,3);
		
		Integer secondLowestNum = numbers.stream()
										.distinct()
										.sorted()	
										.skip(1)
										.findFirst().get();
		
		System.out.println(secondLowestNum);
		
		Integer secondHighNum =  numbers.stream()
										.distinct()
										.sorted(Comparator.reverseOrder())
										.skip(1)
										.findFirst().get();
		
		System.out.println(secondHighNum);
		
		
	}

}
