package com.hyr.dpTests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicTest3 {
	
	@Test(dataProvider =  "testData")
	public static void test1(Object[] s)
	{
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			
		}
		System.out.println("*************************");
	}
	@DataProvider()
	public Iterator<Object> testData()
	{
Set<Object>data = new HashSet<Object>();
		data.add(new Object[] {"Vani", 123});
		data.add(new Object[] {"Shaekar", 123});
		data.add(new Object[] {"Mokshi", 345});
		data.add(new Object[] {"Sathwik", 567});
		return data.iterator();
	}

}
