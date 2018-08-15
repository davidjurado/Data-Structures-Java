package com.recursion;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.print("Number to calculate: ");
		long Number= reader.nextLong(); // Scans the next token of the input as an int.
		reader.close();
		
		System.out.println("Nth Fibonacci for "+Number+" is "+fib(Number));

	}
	
	static long fib(long n) {
		if (n<=1) {
			return n;
		}else {
			return fib(n-1)+fib(n-2);
		}
	}

}
