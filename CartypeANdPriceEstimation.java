package com.chainsys;

import java.util.Scanner;

public class CartypeANdPriceEstimation {
	/**
	 * Gets the type of car the passenger needs to travel
	 */
	public static void SelectCar() {
		System.out.println(" 1.MICRO(rs.10/km)\n 2.MINI(rs.15/km)\n 3.PRIME(rs.20/km)\n");
		
        Scanner ct= new Scanner(System.in);
        System.out.println("Select the number adjacent to the car type\n");
	    int preference = ct.nextInt();
		System.out.println("CARTYPE:");
		if (preference == 1) {
			System.out.println("MICRO SELECTED\n");
		} else if (preference == 2) {
			System.out.println("MINI SELECTED\n");
		} else if (preference == 3) {
			System.out.println("PRIME SELECTED\n");
		} else {
			System.out.println("Select the valid number\n");
		}
		GetsKilometer(preference);
		//return preference;
	}
	/**
	 * Gets the number of kilomters as input from the user & returns the total bill
	 * amount without gst.
	 * 
	 * type of car preference method is called in this class
	 * 
	 * @return
	 */
		public static void GetsKilometer(int CarSelection) {
			double amount, kilometers;
			Scanner pl = new Scanner(System.in);
			System.out.println("ENter the Number of kilometers you need to travel");
			kilometers = pl.nextFloat();
			
			if (CarSelection == 1) {
				amount = (double) (10 * kilometers);
				System.out.println("Your Total Bill Amount is" + amount);
				GSTCalculation.GstCalculationMethod(amount,kilometers);
			} else if (CarSelection == 2) {
				amount = (double) (15 * kilometers);
				System.out.println("Your Total Bill Amount is" + amount);
				GSTCalculation.GstCalculationMethod(amount,kilometers);
			} else if (CarSelection == 3) {
				amount = (double) (20 * kilometers);
				System.out.println("Your Total Bill Amount is" + amount);
				GSTCalculation.GstCalculationMethod(amount,kilometers);
			} else {
				System.out.println("CarType was not correct");
				amount = (double) 0.000000;
				
				GetsKilometer(CarSelection);
			}
		

	}

}
