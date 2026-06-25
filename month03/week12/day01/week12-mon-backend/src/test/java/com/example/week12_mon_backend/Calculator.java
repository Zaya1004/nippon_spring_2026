package com.example.week12_mon_backend;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Calculator {
	@Test
	void testAdd() {
		Calculator calculator = new Calculator();
		assertEquals(5, calculator.add(2,3));
	}
}
