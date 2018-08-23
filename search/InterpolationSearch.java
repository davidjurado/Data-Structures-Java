package com.search;

import java.util.Scanner;

public class InterpolationSearch {

	public static void main(String[] args) {//O(n), sin embargo, bajo la hipótesis de una distribución 
		//uniforme de los datos es O(log log n)
		
		DataSet data = new DataSet(1000000);
		Boolean IsFound=false;
		int low=0;
		int high=data.getSize()-1;
		int mid=0;
		 
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.print("Number to search: ");
		int Search = reader.nextInt(); // Scans the next token of the input as an int.
		reader.close();
		
		while(!IsFound) {
			
			if(low>high) {
				System.out.println("Number not found");
				break;
			}
			
			mid=low+((high-low)/(data.data[high]-data.data[low]))*(Search-data.data[low]);
			data.NumberTry++;
			
			if(data.data[mid]==Search) {
				System.out.println("Number found after: "+data.NumberTry);
				IsFound=true;
			}
			else if(data.data[mid]<Search) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}

	}

}
