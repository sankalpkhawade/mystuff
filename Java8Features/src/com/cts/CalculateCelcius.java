package com.cts;

import java.util.Scanner;

@FunctionalInterface
interface Fahrenheit {
	public double toCelsiusLambda(double fahrenheit);

	public static double toCelsius(double fahrenheit) {

		double celcius = (fahrenheit - 32) * 5 / 9;

		return celcius;
	}
}

public class CalculateCelcius {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit");
		double ft = sc.nextInt();
		System.out.printf("Celcius by arithmetic Function : %.2f", Fahrenheit.toCelsius(ft));
		Fahrenheit ft1 = fahrenheit -> (fahrenheit - 32) * 5 / 9;
		System.out.printf("\nCelcius by lambda Function : %.2f", ft1.toCelsiusLambda(ft));
		sc.close();

	}

}
