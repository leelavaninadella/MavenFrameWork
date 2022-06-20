package com.hyr.groupTests;

import org.testng.annotations.Test;

public class NewTest2 {
	@Test(groups= "functional")
	public void test4() {
		System.out.println("Test4");
	}

	@Test(groups = { "smoke", "functional"})
	public static void test5() {
		System.out.println("Test5");
	}

	@Test(groups = "sanity")
	public static void test6() {
		System.out.println("Test6");
	}

	@Test
	public static void test7() {
		System.out.println("Test7");
	}
}
