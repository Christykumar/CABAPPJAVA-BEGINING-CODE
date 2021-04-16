package com.chainsys;

//import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class PeakHoursAndSeniorDiscount {
	/**
	 * checks if the time of journey is of peakhours or not
	 */
	public static void PeakHourExtras(double kilometer,double Total, int hour) {
		//int JourneyHour=BokingTime.JourneyDateAndTime();
		if (hour >= 17 && hour <= 19) {
			System.out.println("peakhours");
			double ToatalAfterPeak= Total+(kilometer*1.25);
			System.out.println("Toatal amount After the Peak hour estimation"+ ToatalAfterPeak );
			SeniorCitizenOffer(ToatalAfterPeak, Total);
		} 
		else {
			System.out.println("normal hours so no extra charges");
			double ToatalAfterPeak= Total+(kilometer*0);
			System.out.println("Toatal amount After the Peak hour estimation"+ ToatalAfterPeak );
			SeniorCitizenOffer(ToatalAfterPeak, Total);
			
		}
	}
	/**
	 * Checks wheather the travelling person is a senior citizen 
	 */
	public static void SeniorCitizenOffer(double ToatalAfterPeak, double Total) {
		Scanner co = new Scanner(System.in);
		System.out.println("Enter the DateOfBirth: ");
		String DobStr = co.next(); //format yyyy/mm/dd
		LocalDate dobObject = LocalDate.parse(DobStr);
		LocalDate CurrentDate= LocalDate.now();
		System.out.println("DOB : " + dobObject);
		int dobyear= dobObject.getYear();
		int CurrentYear=CurrentDate.getYear();
		int age=CurrentYear-dobyear;//calculates the year
	    if(age>59) {
	    	double TotalDiscount=ToatalAfterPeak/2;
	    	System.out.println("Total after the senoior citizen discount"+ TotalDiscount);
	    }
	    else {
	    	System.out.println("No senior citizen discounts");
	    	System.out.println("same amount:"+ ToatalAfterPeak);
	    }
	                       
	}
}
