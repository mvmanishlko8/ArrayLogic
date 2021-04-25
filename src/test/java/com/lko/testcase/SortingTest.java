package com.lko.testcase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.lko.logic.SortingLogic;

public class SortingTest {
	
	private SortingLogic sortingLogic;
	
	@BeforeEach
	public void setUp() throws Exception {
		sortingLogic = new SortingLogic();
    }
	
	@Test                                               
    @DisplayName("Simple sorting logic, assuming first element is the smallest one!")   
    public void testSortingLogic() {
		int arr[] = { 17, 21, 32, 79, 95, 36, 21 };
		int[] arrTemp = arr;
		
		Arrays.sort(arrTemp);
		sortingLogic.sortArray(arr);
		
        assertEquals(arrTemp, arr);
    }
	
}
