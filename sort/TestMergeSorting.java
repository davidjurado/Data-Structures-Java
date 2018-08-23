package com.sort;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestMergeSorting {



	@Test
	public void testEmptyArray() {
		int [] originalArray= {};
		int [] expectedArray= {};
		assertTrue(Arrays.equals(expectedArray, new MergeSorting().prepareForSort(originalArray)));
	}
	
	@Test
	public void testArrayWithOneElement() {
		int [] originalArray= {1};
		int [] expectedArray= {1};
		assertTrue(Arrays.equals(expectedArray, new MergeSorting().prepareForSort(originalArray)));
	}
	
	@Test
	public void testSortedArray() {
		int [] originalArray= {1,2,3,4,5,6,7};
		int [] expectedArray= {1,2,3,4,5,6,7};
		assertTrue(Arrays.equals(expectedArray, new MergeSorting().prepareForSort(originalArray)));
	}
	
	@Test
	public void testUsortedArray() {
		int [] originalArray= {9,8,7,6,5,4,3,2,1};
		int [] expectedArray= {1,2,3,4,5,6,7,8,9};
		assertTrue(Arrays.equals(expectedArray, new MergeSorting().prepareForSort(originalArray)));
	}

}
