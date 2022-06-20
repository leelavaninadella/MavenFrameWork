package com.hyr.demoTests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class NewTest2 {
	@Test
	public void test4() {
		System.out.println("Test4 Method....");
	}

	@Test(enabled = false)
	public void test5() {
		System.out.println("Test5 Method....");
	}

	@Ignore
	@Test
	public void test6() {
		System.out.println("Test6 Method....");
		System.out.println("Test6 Method....");
		System.out.println("Test6 Method....");
	}
}
