package com.hyr.dpTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicTest2 {

	@Test(dataProvider = "data")
	public static void test1(Object[] s) {
		// System.out.println(s[0] + ">>" +s[1] + ">>" + s[2]);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		System.out.println("***************************");

	}

	@DataProvider
	public static Object[] data() {
		Object[][] data = new Object[][] { { "Vani", 123, "Nadella", 4567 }, { "Shekar", 456, "Pokuru" },
				{ "Mokshi", 789, "Pokuru", 34, "ert" }, { "Sathwik", 345, "Pokuru" } };
		return data;
	}

}
