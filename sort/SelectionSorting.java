package com.sort;

import java.util.Arrays;

public class SelectionSorting {

	public static void main(String[] args) {
		int [] array= {20,2,57,10,1,36,98,7,40};
		System.out.println("Before sort:\n"+Arrays.toString(array));
		array=selectionSort(array);
		System.out.println("\nAfter sort:\n"+Arrays.toString(array));
	}
	
	static int[] selectionSort(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			int index=i;
			for(int j=i+1;j<array.length;j++) {
				if(array[index]>array[j]) {
					index=j;
				}
			}
			if(index!=i) {
				int temp=array[index];
				array[index]=array[i];
				array[i]=temp;
			}
		}
		return array;
	}

}
