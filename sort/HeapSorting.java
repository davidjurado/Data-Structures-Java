package com.sort;

import java.util.Arrays;

public class HeapSorting {
	
	static int total;
	
	public static void main(String[] args) {
		Integer[] array={20,2,57,10,1,36,98,7,40};
		System.out.println("Before sort:\n"+Arrays.toString(array));
		array=heapSort(array);
		System.out.println("\nAfter sort:\n"+Arrays.toString(array));
		}
	
	static void swap(Comparable[] array, int a, int b){
		Comparable temp= array[a];
		array[a]= array[b];
		array[b]= temp;
		}
	
	static void heapify(Comparable[] array, int index){
		int left= index*2;
		int rigth=index*2+1;
		int parent=index;
		if( left<= total && array[left].compareTo(array[parent])>=0)
			parent=left;
		if( rigth<= total && array[rigth].compareTo(array[parent])>=0)
			parent=rigth;
		if( parent!=index){
			swap(array,index,parent);
			heapify(array, parent);
			}
		}
	
	static Integer[] heapSort( Integer[] array){
		total=array.length-1;
		for(int i=total/2;i>=0;i--)
			heapify(array, i);
		for(int i=total;i>0;i--){
			swap(array,0,i);
			total--;
			heapify(array, 0);
			}
		return array;
		}
}