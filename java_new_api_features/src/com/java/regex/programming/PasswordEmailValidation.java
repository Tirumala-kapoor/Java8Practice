package com.java.regex.programming;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordEmailValidation {
	
	public static void main(String[] args) {
		
//		Scanner s = new Scanner(System.in);
//		String input = s.next();
		String input = "ahadev1921";
		Pattern highReg = Pattern.compile("((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()]).{8,20})");
		
		Pattern medReg = Pattern.compile("((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20})");
		
		if(highReg.matcher(input).matches()) {
			System.out.println("HIGH");
		}else if(medReg.matcher(input).matches()) {
			System.out.println("MEDIUM");
		}else {
			System.out.println("LOW");
		}
		String email = "ahadev.-+1921@gmail.co.edu";
		Pattern emailReg = 
				Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+([a-zA-Z]{2,7}$)");

		if(emailReg.matcher(email).matches()) {
			System.out.println("VALID EMAIL");
		}else {
			System.out.println("INVALID EMAIL");
			
		}
	}
	

}
