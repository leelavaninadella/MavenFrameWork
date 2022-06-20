package com.hyr.Listeners;

import org.junit.Assert;
import org.testng.annotations.*;
@Listeners(ITestListenerClass.class)
public class TestClass1 {

	@Test
	public static void test1() {
		System.out.println("I'm in Test1 Method..");
	}

	@Test(dependsOnMethods = "test1")
	public static void test2() {
		System.out.println("I,m in test2 method..");
		Assert.assertTrue(false);
	}

	@Test(timeOut = 3000)

	public static void test3() throws Exception {
		Thread.sleep(3000);
		System.out.println("I'm in test3 method..");
	}

	@Test(dependsOnMethods = "test3")
	public static void test4() {
		System.out.println("I,m in test4 method..");
	}

}
