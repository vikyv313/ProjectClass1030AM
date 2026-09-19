package com.cts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class B {
	@Test
	public void test1() {
		System.out.println("E2E");
	}
	
	@Test
	public void test4() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void test3() {
		System.out.println("Sanity");
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(false);
	}
	
}
