package com.cts;

import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TestLocalDate {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		System.out.println("Local Date : " + localDate);

		int dateOfMonth = localDate.getDayOfMonth();
		int year = localDate.getYear();
		Month month = localDate.getMonth();
		System.out.println("Date of month : " + dateOfMonth + "\nMonth : " + month + "\nYear : " + year);

		LocalDate yesterDay = localDate.minusDays(1);
		System.out.println("Yesterday Date : " + yesterDay);

		LocalDate tomorrow = localDate.plusDays(1);
		System.out.println("Tomorrow Date : " + tomorrow);

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Date : " + localDateTime);

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
		String dateFormatter = localDateTime.format(dateTimeFormatter);
		System.out.println("Date Formatter : " + dateFormatter);

		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("Zone Date Time : " + zonedDateTime);
		System.out.println("Zone : " + zonedDateTime.getZone());

		Period period = Period.between(yesterDay, tomorrow);
		System.out.println("Period between : " + period);
		
		Duration duration=Duration.ofDays(12);
		System.out.println("Long Days : "+duration);

	}

}
