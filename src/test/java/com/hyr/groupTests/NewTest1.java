package com.hyr.groupTests;

import org.testng.annotations.Test;

public class NewTest1 {
	@Test(groups = {"smoke", "sanity"})
	public void test1() {
		System.out.println("Test1");
	}

	@Test(groups = {"smoke", "regression", "functional"})
	public static void test2() {
		System.out.println("Test2");
	}

	@Test
	public static void test3() {
		System.out.println("Test3");
	}
}
