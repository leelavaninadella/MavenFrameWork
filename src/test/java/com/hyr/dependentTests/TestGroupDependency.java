package com.hyr.dependentTests;

import org.testng.annotations.Test;

public class TestGroupDependency {

	@Test(groups = "smoke")
	public static void test1() {
		System.out.println("Smoke");
	}

	@Test(groups = "smoke")
	public static void test2() {
		System.out.println("smoke");
	}

	@Test(groups = "smoke")
	public static void test3() {
		System.out.println("smoke");
	}

	@Test(groups = "sanity")
	public static void test4() {
		System.out.println("sanity");
	}

	@Test(groups = "sanity")
	public static void test5() {
		System.out.println(5/0);
	}

	@Test(groups = "regression")
	public static void test6() {
		System.out.println("regression");
	}

	@Test(groups = "regression")
	public static void test7() {
		System.out.println("regression");
	}

	@Test(dependsOnGroups = "smoke", alwaysRun = true)
	public static void test0() {
		System.out.println("Main Method");
	}
}
