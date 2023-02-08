package com.newapi.features.streams.programming;

import java.util.Arrays;
import java.util.List;

public class SumOfAllNummbers {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(12,33,45,65,78,77);
		
		Integer sumOfInteger = numbers.stream().reduce((a,b)->a+b).get();
		System.out.println(sumOfInteger);
	}

}
