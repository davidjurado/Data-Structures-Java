package com.recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in); 
		System.out.print("Number to calculate: ");
		long Number= reader.nextLong();
		reader.close();
		
		System.out.println("Factorial of "+Number+" is "+fact(Number));

	}
	
	static long fact(long n) {
		if(n==0) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
}
