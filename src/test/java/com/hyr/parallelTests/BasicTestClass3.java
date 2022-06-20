package com.hyr.parallelTests;

import org.testng.annotations.Test;

public class BasicTestClass3 {

	@Test
	public static void test1() {

		System.out.println("BasicTestClass3 >> test1() Method >> " + Thread.currentThread().getId());
	}

	@Test
	public static void test2() {

		System.out.println("BasicTestClass3 >> test2() Method >> " + Thread.currentThread().getId());
	}

	@Test
	public static void test3() {

		System.out.println("BasicTestClass3 >> test3() Method >> " + Thread.currentThread().getId());
	}

	@Test
	public static void test4() {

		System.out.println("BasicTestClass3 >> test4() Method >> " + Thread.currentThread().getId());
	}
}
