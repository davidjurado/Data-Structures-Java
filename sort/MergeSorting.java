package com.sort;

import java.util.Arrays;

public class MergeSorting {int[] array;

int[] TempArray;

public static void main(String[] args) {
	int [] array= {20,2,57,10,1,36,98,7,40};
	System.out.println("Before sort:\n"+Arrays.toString(array));
	new MergeSorting().prepareForSort(array);
	System.out.println("\nAfter sort:\n"+Arrays.toString(array));
	}
	

int[] prepareForSort(int[] array){
	this.array=array;
	this.TempArray=new int[array.length];
	mergeSort(0,array.length-1);
	return array;
	}

void mergeSort(int lowerIndex, int higherIndex){	
	if(lowerIndex< higherIndex ){
		int middle=lowerIndex+ (higherIndex-lowerIndex)/2;
		mergeSort(lowerIndex,middle);
		mergeSort(middle+1,higherIndex);
		mergePart(lowerIndex,middle,higherIndex);
		}
	}
	
void mergePart(int lowerIndex,int middle,int higherIndex ){
	for(int i=lowerIndex;i<=higherIndex;i++)	
		TempArray[i]= array[i];
	int i=lowerIndex;
	int j=middle+1;
	int  k=lowerIndex;
	while(i<=middle && j<= higherIndex){
		if( TempArray[i]<= TempArray[j]){
			array[k] =TempArray[i];
			i++;
			}else{
				array[k] =TempArray[j];
				j++; 
				}
		k++;
		}
	while(i<=middle){
		array[k] =TempArray[i];
		k++;
		i++;
		}
	}
}