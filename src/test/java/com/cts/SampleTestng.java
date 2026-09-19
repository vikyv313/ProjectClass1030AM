package com.cts;

import org.testng.annotations.Test;

public class SampleTestng {
	
	@Test
	private void test1() {
		System.out.println("Test1");
	}
	@Test(invocationCount = 5)
	private void test2() {
		System.out.println("Test2");
	}
	@Test
	private void test4() {
		System.out.println("Test4");
	}
	@Test
	private void test5() {
		System.out.println("Test5");
	}
	
	@Test
	private void test3() {
		System.out.println("Test3");
	}
}
