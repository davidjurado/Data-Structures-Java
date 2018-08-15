package com.ds;

public class BigO {
	
	/*
	 *1. Operaciones aritméticas (+, -, *, /, ^, %), y comparaciones toman solo 1 paso para ejecutarse.
	 *2. Ciclos y subrutinas toman n pasos para ejecutarse.
	 *3. Cualquier acceso a memoria toma un paso en ejecutarse.
	 */

	public static void main(String[] args) {
		doublingLoopVariable(500);
	}
	
	static void simpleFunction(int n){
		int a=9;//O(1)
		int b=3;//O(1)

		int sum=a+b+n;//O(1)
		int product=a*b*n;//O(1)
		int quotient=a*n/b;//O(1)

		System.out.println(String.format(
			"The summ is: %s, product is: %s and quotient is: %s", sum,product,quotient));//O(1)
		
		//O(1)+O(1)+O(1)+O(1)+O(1)+O(1)=O(1)
	}
	
	public static void singleForLoop(int n){
		
		for(int i=0; i<n; i++){//O(n)
				System.out.println(String.format("Square of %s is: %s", i, Math.pow(i,2.0)));//O(1)
		}
		
		//O(n)*O(1)=O(n)
	}
	
	public static void nestedForLoop(int n){
		
		for(int i=0; i<n; i++){//O(n)
			for(int j=0; j<n; j++){//O(n)
			    System.out.println(String.format("Product of %s and %s is: %s", i, j, i*j));//O(1)
			}
		}
		
		//O(n)*O(n)*O(1)=O(n^2)
	}
	
	public static void twoForLoops(int n){
		
		for(int i=0; i<n; i++){//O(n)
			System.out.println("Printing: " + i);//O(1)
		}
		for(int i=0; i<1000; i++){//O(1000)
			System.out.println("Printing: " + i);//O(1)
		}
		
		//O(n)*O(1)+O(1000)*O(1)=O(n)*O(1000)=O(n)
	}
	
	public static void twoForLoopsNAndM(int n, int m){
		
		for(int i=0; i<n; i++){//O(n)
			for(int j=0; j<m; j++){//O(m)
			    System.out.println("Printing: " + (i*j));//O(1)
			}
		}
		
		//O(n)*O(m)*O(1)=O(n*m)
	}
	
	public static void doublingLoopVariable(int n){
		
		for(int i=1; i<n;){//O(Log(n))
			System.out.println("Value of i is: " + i);//O(1)
			i=i*2;//O(1)
		}
	
		//O(Log(n))*(O(1)+O(1))=O(Log(n))
	}
	
}
