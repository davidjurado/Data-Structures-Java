package com.ds;

import java.util.Arrays;

public class OneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers= new int[5];
		numbers[0]=20;
		numbers[1]=5;
		numbers[2]=10;
		numbers[3]=6;
		numbers[4]=11;
		//System.out.println(numbers[0]);
		for (int i=0; i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		//Array of objects
		Student[] students=new Student[4];
		students[0]=new Student("Hussain",16);
		students[1]=new Student("Jena",2);
		students[2]=new Student("Laya",1);
		students[3]=new Student("Waeel",0);
		//System.out.println(numbers[0]);
		//for (int i=0; i<students.length;i++) {
		//	System.out.println("Name: "+students[i].name+" Age:"+students[i].age);
		//}
		for (Student student : students) {
			System.out.println("Name: "+student.name+" Age:"+student.age);
		}
		
		Arrays.sort(numbers);
		for (int i=0; i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}
	

}
