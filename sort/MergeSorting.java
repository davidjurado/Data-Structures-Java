package com.sort;

public class MergeSorting {int[] array;

int[] TempArray;

public static void main(String[] args) {
	
	int [] arr= {20,2,57,10,1,36,98,7,40};
	
	System.out.println("Before sort:");
	for (int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+"\t");
	}
	
	new MergeSorting().PrepareForSort(arr);
	System.out.println("\nAfter sorting");
	for(int i=0;i< arr.length;i++)
		System.out.print( arr[i]+ "\t");
	}
	

void PrepareForSort(int[] arr){
	this.array=arr;
	this.TempArray=new int[arr.length];
	MergeSort(0,arr.length-1);
	}

void MergeSort(int LowerIndex, int HigherIndex){	
	if(LowerIndex< HigherIndex ){
		int middle=LowerIndex+ (HigherIndex-LowerIndex)/2;
		MergeSort(LowerIndex,middle); //ex.(1-5)
		MergeSort(middle+1,HigherIndex);//ex.(6,10)
		MergePart(LowerIndex,middle,HigherIndex);
		}
	}
	
void MergePart(int LowerIndex,int middle,int HigherIndex ){
	for(int i=LowerIndex;i<=HigherIndex;i++)	
		TempArray[i]= array[i];
	int i=LowerIndex;
	int j=middle+1;
	int  k=LowerIndex;
	while(i<=middle && j<= HigherIndex){
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