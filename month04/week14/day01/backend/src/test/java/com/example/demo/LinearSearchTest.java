package com.example.demo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinearSearchTest {
    @Test
    public void linearSearchTest() {
    	int[] numbers = {1, 3, 5, 7, 9, 11, 13};
    	LinearSearch linaerSearch = new LinearSearch(numbers);
    	
    	Assertions.assertEquals(-1, linaerSearch.linearSearch(14));
    	Assertions.assertEquals(4, linaerSearch.linearSearch(9));
    }
	
}
