package com.search;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
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
			
			mid=low+((high-low)/2);
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
