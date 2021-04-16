package com.chainsys;

import java.util.Scanner;

public class login {
	/**
	 * gets login id credentials
	 * mobile number and password
	 */
	public static void loginDetails() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter mobile number:");
		long mobileNo;
		mobileNo = sc.nextLong();
		System.out.println("Enter the password(eight charecters must):");
		String passcode=sc.next();
		String mobileNoVerification = String.valueOf(mobileNo);
		String PassVerification = String.valueOf(passcode);
		if(mobileNoVerification.length()==10 && PassVerification.length()==8) {
			System.out.println("Login Successfull");
			CartypeANdPriceEstimation.SelectCar();//if the password and mobile number meets the given rules 
			                                      // Asks the car type
		}
		else {
			System.out.println("Login unsuccessfull");
			loginDetails();//if the given mobile number and password does not meet the given
			               //level call the function again
		}
	}
	public static void main(String[] args) {
		loginDetails();
	}

}
