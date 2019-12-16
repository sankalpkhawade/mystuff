package com.cognizant.HandsOn2;

public class TaxSlab {
	private double startRange;
	private double endRange;
	private double taxPercentage;
	
	public TaxSlab(double startRange, double endRange, double taxPercentage) {
		this.startRange = startRange;
		this.endRange = endRange;
		this.taxPercentage = taxPercentage;
	}
	
	public double calculateSlabTax(double annualIncome) {
		double taxableAmount = 0.0;
		if (annualIncome > endRange) {
			taxableAmount = endRange - startRange;
		}
		
		if (annualIncome > startRange && annualIncome < endRange) {
			taxableAmount = annualIncome - startRange;
		}
		return taxableAmount * (taxPercentage / 100.0);
	}
}
