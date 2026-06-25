package com.example.week12_mon_backend;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	@Test
	void testAdd() {
		Calculator calculator = new Calculator();
		assertEquals(5, calculator.add(2, 3));
	}
	
	@Test 
	void testSubtract() {
		Calculator calculator = new Calculator();
		assertEquals(3, calculator.subtract(5, 2));
	}
}
