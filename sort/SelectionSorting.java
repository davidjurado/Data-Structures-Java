package com.sort;

public class SelectionSorting {

	public static void main(String[] args) {
		
		int [] arr= {20,2,57,10,1,36,98,7,40};
		
		System.out.println("Before sort:");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		
		SelectionSort(arr);
		System.out.println("\nAfter sort:");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	
	static void SelectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[index]>arr[j]) {
					index=j;
				}
			}
			if(index!=i) {
				int temp=arr[index];
				arr[index]=arr[i];
				arr[i]=temp;
			}
		}
	}

}
