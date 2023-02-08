package com.newapi.features.streams.programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//WAP get/ignore first 5 numbers using limit and skip in stream
public class LimitSkipNumbers {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,3,10,20,30,15,1,13,2,2,10,30,19,3);
		
		//get the first 5 numbers
		List<Integer> first5Num = numbers.stream().limit(5).collect(Collectors.toList());
		System.out.println(first5Num);
		
		//skip the first 5 numbers\
		List<Integer> skip5Num = numbers.stream().skip(5).collect(Collectors.toList());
		System.out.println(skip5Num);
	}

}
