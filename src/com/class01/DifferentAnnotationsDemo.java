package com.class01;

import org.testng.annotations.*;


public class DifferentAnnotationsDemo {
//preconditions, like open browser, navigate to url, login
	@BeforeMethod
	public void beforeMethod() {
		//BayramGul();
		System.out.println("Before Method");
	}
	//closing browser, generating reports
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		//BayramGul();
		System.out.println("Before Suite");
	}
	//closing browser, generating reports
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		//BayramGul();
		System.out.println("Before Class");
	}
	//closing browser, generating reports
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	
	@Test
	public void test() {
		System.out.println("Actual Test is running...");
	}
//	public void BayramGul() {
//		System.out.println("Hi from Bayramgul.");
//	}
}
