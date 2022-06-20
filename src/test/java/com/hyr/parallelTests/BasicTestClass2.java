package com.hyr.parallelTests;

import org.testng.annotations.Test;

public class BasicTestClass2 {

	@Test
	public static void test1() {

		System.out.println("BasicTestClass2 >> test1() Method >> " + Thread.currentThread().getId());
	}

	@Test
	public static void test2() {

		System.out.println("BasicTestClass2 >> test2() Method >> " + Thread.currentThread().getId());
	}

	@Test
	public static void test3() {

		System.out.println("BasicTestClass2 >> test3() Method >> " + Thread.currentThread().getId());
	}

}
