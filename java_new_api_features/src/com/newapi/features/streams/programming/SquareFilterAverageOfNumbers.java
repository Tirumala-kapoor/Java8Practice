package com.newapi.features.streams.programming;

import java.util.Arrays;
import java.util.List;

public class SquareFilterAverageOfNumbers {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,10,20,30);
		
		//Get the square of each number, filter it > 100 and find the avg of it
		
		double result = numbers.stream().map(e->e*e)
								.filter(e->e>100)
								.mapToInt(e->e)
								.average()
								.getAsDouble();
		
		System.out.println(result);
	}

}
