package com.search;
import java.util.Scanner;


public class LinearSearch {

	public static void main(String[] args) {
		
		DataSet data = new DataSet(1000000);
		Boolean IsFound=false;
		 
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.print("Number to search: ");
		int Search = reader.nextInt(); // Scans the next token of the input as an int.
		reader.close();
		
		for(int i=0;i<data.getSize();i++) {
			data.NumberTry++;
			if(data.data[i]==Search) {
				System.out.println("Element found after try: "+data.NumberTry);
				IsFound=true;
				break;
			}
		}
		
		if(!IsFound)
			System.out.println("Number not found");
	}

}
