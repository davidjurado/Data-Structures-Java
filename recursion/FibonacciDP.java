package com.recursion;

import java.util.Scanner;

public class FibonacciDP {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Number to calculate: ");
		int Number= reader.nextInt();
		reader.close();
		
		System.out.println("Nth Fibonacci for "+Number+" is "+fib(Number));
}
	
	static int fib(int n)
    {

    int f[] = new int[n+1];
    int i;
   
    f[0] = 0;
    f[1] = 1;
     
    for (i = 2; i <= n; i++)
    {
        f[i] = f[i-1] + f[i-2];
    }
      
    return f[n];
    }
}