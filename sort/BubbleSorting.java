package com.sort;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		int [] array= {20,2,57,10,1,36,98,7,40};
		System.out.println("Before sort:\n"+Arrays.toString(array));
		array=bubbleSort(array);
		System.out.println("\nAfter sort:\n"+Arrays.toString(array));
	}
	
	static int[] bubbleSort(int[] array) {
		int size=array.length;
		int temp=0;
		for (int i=0;i<size;i++) {
			for(int j=1;j<(size-i);j++) {
				if(array[j-1]>array[j]) {	
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}

}
