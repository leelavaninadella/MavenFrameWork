package com.hyr.groupTests;

import org.testng.annotations.Test;

public class NewTest3 {

	@Test(groups = "smoke")
	public static void test1() {
		System.out.println("Test1");
	}

	@Test(groups = "sanity")
	public static void test2() {
		System.out.println("Test2");
	}

	@Test(groups = "regression")
	public static void test3() {
		System.out.println("Test3");
	}

	@Test
	public static void test4() {
		System.out.println("Test4");
	}

}
