package com.cts;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StringToDate {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Date : ");
		String date = scanner.nextLine();
		LocalDate localDate = LocalDate.parse(date, formatter);
		System.out.println("Date :" + localDate);
		scanner.close();

	}

}
