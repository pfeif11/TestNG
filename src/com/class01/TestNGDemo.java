package com.class01;

import org.testng.annotations.Test;

public class TestNGDemo {
	//batch or sequential execution
	@Test
	public void testOne() {
		//all these steps are part of one test case
		System.out.println("Step 1");
		System.out.println("Step 2");
		System.out.println("Step 3");
		System.out.println("Step 4");
		
	}
	@Test
	public void testTwo() {
		System.out.println("Test 2");
		
	}
	@Test
	public void testThree() {
		System.out.println("Test 3");
		
	}

}
