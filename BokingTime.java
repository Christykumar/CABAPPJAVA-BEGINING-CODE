package com.chainsys;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class BokingTime {
	/**
	 * Confirms the user about the journey date and time and returns the hours for peak hour 
	 * calculation
	 * @return
	 */
	public static void JourneyDateAndTime(double kilometers,double Total) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Journey date(format yyyy/mm/dd): ");
		String JourneyDateStr = sc.next(); //format yyyy-mm-dd
		LocalDate JourneyDateNo = LocalDate.parse(JourneyDateStr);
		
		LocalDate CurrentDay= LocalDate.now();
		if(JourneyDateNo.isAfter(CurrentDay)) {
			System.out.println("JourneyDate:"+JourneyDateNo);
		}
		else{
			JourneyDateAndTime( kilometers, Total);
		};
		System.out.println("Enter the Journey Time(format hh:mm:ss): ");
		String JourneyTimeStr = sc.next(); //format hh:mm:ss
		LocalTime JourneyTimeNo = LocalTime.parse(JourneyTimeStr);
		LocalTime CurrentTime= LocalTime.now();
		if(JourneyTimeNo.isAfter(CurrentTime)) {
			System.out.println("JourneyTime:"+JourneyTimeNo);
			int hour= JourneyTimeNo.getHour();
			PeakHoursAndSeniorDiscount.PeakHourExtras(kilometers, Total, hour);
		}
		else{
			JourneyDateAndTime( kilometers, Total);
		}
		
	}

}
