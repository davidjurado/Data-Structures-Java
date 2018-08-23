package com.sort;

import java.util.Arrays;

public class QuickSorting {

	public static void main(String[] args) {
		int [] array= {20,2,57,10,1,36,98,7,40};
		System.out.println("Before sort:\n"+Arrays.toString(array));
		array=quickSort(array,0,array.length-1);
		System.out.println("\nAfter sort:\n"+Arrays.toString(array));
		}
	
	static int[] quickSort(int[] array, int low, int high) {
		
		if(array.length==0) {
			return array;
		}
		if(low>high) return null;
		
		int mid=low+(high-low)/2;
		int pivot=array[mid];
		int i=low;
		int j=high;
		while(i<=j) {
			while(array[i]<pivot)
				i++;
			while(array[j]>pivot)
				j--;
			if(i<=j) {
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				i++;
				j--;
			}
		}
		if(low<j)
			quickSort(array, low, j);
		if(high>i)
			quickSort(array, i, high);
		return array;
	}

}
