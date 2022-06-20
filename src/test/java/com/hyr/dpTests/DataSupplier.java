package com.hyr.dpTests;

import org.testng.annotations.DataProvider;

public class DataSupplier {

	@DataProvider(indices = {0,2})
	public static Object[][] testData() {
		Object[][] data = new Object[][] { 
			{ "Vani", 123, "Telugu" }, { "Mokshi", 234, "Hindi" },
				{ "Sathwik", 456, "Kannada" }, { "Shekar", 678, "Tamil" }

		};
		return data;
	}
}
