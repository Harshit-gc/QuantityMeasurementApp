package com.harshit.quantitymeasurement;

public interface IMeasurable {
	
	public double getConversionFactor();
	
	public double convertToBaseUnit(double value);
	
	public double convertFromBaseUnit(double value);
	
}