package com.chainsys;

import java.util.Scanner;

public class login {
	/**
	 * gets login id credentials
	 */
	public static void main(String[] args) {
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
		}
		else {
			System.out.println("Login unsuccessfull");
		}
		CartypeANdPriceEstimation.SelectCar();
	}

}
