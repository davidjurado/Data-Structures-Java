package com.sort;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestHeapSorting {

	@Test
	public void testEmptyArray() {
		Integer[] originalArray= {};
		Integer [] expectedArray= {};
		assertTrue(Arrays.equals(expectedArray, HeapSorting.heapSort(originalArray)));
	}
	
	@Test
	public void testArrayWithOneElement() {
		Integer [] originalArray= {1};
		Integer [] expectedArray= {1};
		assertTrue(Arrays.equals(expectedArray, HeapSorting.heapSort(originalArray)));
	}
	
	@Test
	public void testSortedArray() {
		Integer [] originalArray= {1,2,3,4,5,6,7};
		Integer [] expectedArray= {1,2,3,4,5,6,7};
		assertTrue(Arrays.equals(expectedArray, HeapSorting.heapSort(originalArray)));
	}
	
	@Test
	public void testUsortedArray() {
		Integer [] originalArray= {9,8,7,6,5,4,3,2,1};
		Integer [] expectedArray= {1,2,3,4,5,6,7,8,9};
		assertTrue(Arrays.equals(expectedArray, HeapSorting.heapSort(originalArray)));
	}

}
