package com.sort;

public class HeapSorting {
	
	static int total;
	
	public static void main(String[] args) {
		
		Integer[] arr={20,2,57,10,1,36,98,7,40};
		System.out.println("Before Sort");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] +"\t");
		
		HeapSort(arr);
		
		System.out.println("\nAfter Sort");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] +"\t");
		}
	
	static void swap(Comparable[] arr, int a, int b){
		Comparable temp= arr[a];
		arr[a]= arr[b];
		arr[b]= temp;
		}
	
	static void heapify(Comparable[] arr, int i){
		int left= i*2;
		int rigth=i*2+1;
		int parent=i;
		if( left<= total && arr[left].compareTo(arr[parent])>=0)
			parent=left;
		if( rigth<= total && arr[rigth].compareTo(arr[parent])>=0)
			parent=rigth;
		if( parent!=i){
			swap(arr,i,parent);
			heapify(arr, parent);
			}
		}
	
	static void HeapSort( Comparable[] arr){
		total=arr.length-1;
		for(int i=total/2;i>=0;i--)
			heapify(arr, i);
		for(int i=total;i>0;i--){
			swap(arr,0,i);
			total--;
			heapify(arr, 0);
			}
		}
}