package com.sort;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestQuickSorting {

	@Test
	public void testEmptyArray() {
		int [] originalArray= {};
		int [] expectedArray= {};
		assertTrue(Arrays.equals(expectedArray, QuickSorting.quickSort(originalArray,0,originalArray.length-1)));
	}
	
	@Test
	public void testArrayWithOneElement() {
		int [] originalArray= {1};
		int [] expectedArray= {1};
		assertTrue(Arrays.equals(expectedArray, QuickSorting.quickSort(originalArray,0,originalArray.length-1)));
	}
	
	@Test
	public void testSortedArray() {
		int [] originalArray= {1,2,3,4,5,6,7};
		int [] expectedArray= {1,2,3,4,5,6,7};
		assertTrue(Arrays.equals(expectedArray, QuickSorting.quickSort(originalArray,0,originalArray.length-1)));
	}
	
	@Test
	public void testUsortedArray() {
		int [] originalArray= {9,8,7,6,5,4,3,2,1};
		int [] expectedArray= {1,2,3,4,5,6,7,8,9};
		assertTrue(Arrays.equals(expectedArray, QuickSorting.quickSort(originalArray,0,originalArray.length-1)));
	}

}
