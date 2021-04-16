package com.chainsys;

public class GSTCalculation {
	/**
	 * CAlulates the GST service tax amount
	 */
	public static void GstCalculationMethod(double amount,double kilometers) {
		double GST = (amount * 7) / 100;
		double Total = GST + amount;
		System.out.println("Your total bill amount with GST is: " + Total);
		BokingTime.JourneyDateAndTime(kilometers,Total);
	}

}
