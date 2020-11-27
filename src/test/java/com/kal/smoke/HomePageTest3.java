package com.kal.smoke;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest3 {
	
	@BeforeTest
	public void setup() {
		System.out.println("Browser  setup");
	}
	@AfterTest
	public void teardown() {
		
		System.out.println("Browser shutting down");
		
	}
	
	
	
	@Test
	public void Test1() {
		
		System.out.println("Testing 1 is in progress...");
		
	}
	
	/*
	 * @BeforeMethod public void beforeMethiod() {
	 * 
	 * System.out.println("Before Methos...");
	 * 
	 * }
	 * 
	 * @AfterMethod public void afterMethod() {
	 * 
	 * System.out.println("Afetr Method...");
	 * 
	 * }
	 */
	
	@Test
	public void Test2() {
		
		System.out.println("Testing 1 is in progress...");
		
	}
	
	@Test
	public void Test3() {
		
		System.out.println("Testing 1 is in progress...");
		
	}
	
	

}
