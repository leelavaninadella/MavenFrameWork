package com.hyr.groupTests;

import org.testng.annotations.Test;

public class NewTest4 {

	@Test(groups = { "smoke", "regression" })
	public static void test5() {
		System.out.println("Test5");
	}

	@Test(groups = { "sanity", "functional", "regression" })
	public static void test6() {
		System.out.println("Test6");
	}

	@Test
	public static void test7() {
		System.out.println("Test7");
	}

}
