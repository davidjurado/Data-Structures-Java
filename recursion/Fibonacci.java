package com.recursion;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.print("Number to calculate: ");
		long Number= reader.nextLong();
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

//1 1 2 3 5 8 13 21 34 ...