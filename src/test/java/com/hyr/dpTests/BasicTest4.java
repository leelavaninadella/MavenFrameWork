package com.hyr.dpTests;

import org.testng.annotations.Test;

public class BasicTest4 {
	@Test(dataProvider = "testData", dataProviderClass = DataSupplier.class)
	public static void test1(Object[] s)
	{
		for(int i=0; i<s.length;i++)
		{
		System.out.println(s[i]);
		}
		System.out.println("*****************************");
	}

}
