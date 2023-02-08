package com.java.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestMapper {

	

	public static void main(String[] args) {
		DateTimeFormatter dateTimeFormatter_HH_mm_ss_02126457984 = DateTimeFormatter.ofPattern( "HH:mm:ss" );
		// TODO Auto-generated method stub
		String startTime = "01:18:00";
		try {
			LocalTime  time = LocalTime .parse( startTime, dateTimeFormatter_HH_mm_ss_02126457984 );
			System.out.println(time);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
