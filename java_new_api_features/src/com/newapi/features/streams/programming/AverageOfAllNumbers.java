package com.newapi.features.streams.programming;

import java.util.Arrays;
import java.util.List;

public class AverageOfAllNumbers {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(12,33,45,65,78,77);
		
		double avgOfNumbers = numbers.stream()
									.mapToInt(e->e)
									.average()
									.getAsDouble();
		
		System.out.println("Average :"+avgOfNumbers);
	}

}
