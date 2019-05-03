package com.profile.designpattern.iteratorsub;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.springframework.format.annotation.DateTimeFormat;

public class TestClient {
	
	
	 public static void getCurrentTimeWithOffset(String span){
	        System.out.println("-----Current time of different offset-----");
	        ZoneOffset zoneOffset = ZoneOffset.of(span);
	        ZoneId zoneId=ZoneId.ofOffset("UTC", zoneOffset);
	        LocalTime offsetTime = LocalTime.now(zoneId);
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd hh:mm a");
	        String formattedTime=offsetTime.format(formatter);
	        System.out.println("Current time of the day with offset -08:00: " + formattedTime);
	    }
	/*public static void main(String[] args) {
		getCurrentTimeWithOffset("-08:00");
		getCurrentTimeWithOffset("-09:00");
		
	}*/
	
	public static void main(String[] args) {
		 
		Calendar localTime = Calendar.getInstance();
 
		int hour = localTime.get(Calendar.HOUR);
		int minute = localTime.get(Calendar.MINUTE);
		int second = localTime.get(Calendar.SECOND);
		int year = localTime.get(Calendar.YEAR);
 
		// Print the local time
		System.out.printf("Local time: %02d:%02d:%02d %02d\n", hour, minute, second, year);
 
		// Create a calendar object for representing a Singapore time zone.
		Calendar indiaTime = new GregorianCalendar(TimeZone.getTimeZone("America/Denver"));
		indiaTime.setTimeInMillis(localTime.getTimeInMillis());
		hour = indiaTime.get(Calendar.HOUR);
		minute = indiaTime.get(Calendar.MINUTE);
		second = indiaTime.get(Calendar.SECOND);
		year = indiaTime.get(Calendar.YEAR);
 
		// Print the local time in Germany time zone
		System.out.printf("India time: %02d:%02d:%02d %02d\n", hour, minute, second, year);
 
		// Here are all list of timezones for your reference
		log(TimeZone.getAvailableIDs());
	}
 
	private static void log(String[] availableIDs) {
 
		System.out.println("\nHere are all list of timezones for your reference:");
		for (String temp : availableIDs) {
			System.out.println(temp);
		}
	}
 
}
