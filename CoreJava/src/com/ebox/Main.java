package com.ebox;
import java.text.*;

public class Main {
	private static DecimalFormat d=new DecimalFormat("0.00");
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		double buyingPrice=20.54;
		double sellingPrice=30.50;
		System.out.println("Buying price is "+d.format(buyingPrice));
		System.out.println("Selling price is "+d.format(sellingPrice));
	}

}
