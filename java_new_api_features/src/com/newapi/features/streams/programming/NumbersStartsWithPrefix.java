package com.newapi.features.streams.programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartsWithPrefix {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(2,32,222,24,567,890,776,23,211,432,22,-21);
		
		List<Integer> numWith2 = numbers.stream()
				.map(e-> String.valueOf(e))
				.filter(e -> e.startsWith("2") || e.startsWith("-2") )
				.map(Integer::valueOf)
				.collect(Collectors.toList());
		
		System.out.println(numWith2);
				

	}

}
