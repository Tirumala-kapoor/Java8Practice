package com.newapi.features.streams.programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,32,222,24,567,890,776,23,211,432,22,-21);
		
		Integer maxVal = numbers.stream()
								.max(Comparator.comparing(Integer::valueOf))
								.get();
		
		System.out.println("Maximum : "+maxVal);
		
		Integer minVal = numbers.stream()
							.min(Comparator.comparing(Integer::valueOf))
							.get();
		
		System.out.println("Minimum : "+minVal);
	}

}
