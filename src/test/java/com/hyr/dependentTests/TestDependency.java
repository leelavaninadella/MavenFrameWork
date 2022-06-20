package com.hyr.dependentTests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestDependency {

	static String trackingNum;
	
	/*
	 * @Test public static void createShipment() {
	 * System.out.println("Create Shipment");
	 * 
	 * trackingNum="AY907G"; }
	 */

	@Test(dependsOnMethods = {"createShipment"},ignoreMissingDependencies = true)
	public static void trackShipment() throws Exception {

		if (trackingNum != null)
			System.out.println("Track Shipment");
		else
			throw new Exception("Invalid Tracking Number");
	}

	@Test(dependsOnMethods = {"createShipment","trackShipment"})
	public static void cancelShipment() throws Exception {
		if (trackingNum != null)
			System.out.println("Cancel Shipment");
		else
			throw new Exception("Invalid Tracking Number");
	}
}
