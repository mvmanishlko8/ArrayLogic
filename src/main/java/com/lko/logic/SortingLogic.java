package com.lko.logic;

import java.util.Arrays;

public class SortingLogic {

	public static void main(String[] args) {
		int arr[] = { 17, 21, 32, 79, 95, 36, 21 };

		SortingLogic sortingLogic = new SortingLogic();
		
		System.out.println("Before Sorting: " + Arrays.toString(arr));
		sortingLogic.sortArray(arr);
		System.out.println("After Sorting: " + Arrays.toString(arr));

	}

	public void sortArray(int[] arr) {
		// Assuming arr[i] is the smallest number
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] >= arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

}
