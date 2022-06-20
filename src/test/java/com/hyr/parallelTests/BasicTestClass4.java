package com.hyr.parallelTests;

import org.testng.annotations.Test;

public class BasicTestClass4 {

	@Test
	public static void test1() {

		System.out.println("BasicTestClass4 >> test1() Method >> " + Thread.currentThread().getId());
	}

	@Test
	public static void test2() {

		System.out.println("BasicTestClass4 >> test2() Method >> " + Thread.currentThread().getId());
	}

}
