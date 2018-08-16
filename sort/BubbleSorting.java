package com.sort;

public class BubbleSorting {

	public static void main(String[] args) {
		
		int [] arr= {20,2,57,10,1,36,98,7,40};
		
		System.out.println("Before sort:");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		
		BubbleSort(arr);
		System.out.println("\nAfter sort:");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	
	static void BubbleSort(int[] arr) {
		
		int n=arr.length;
		int temp=0;
		
		for (int i=0;i<n;i++) {
			for(int j=1;j<(n-i);j++) {
				if(arr[j-1]>arr[j]) {	
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			
			}
		}
	}

}
