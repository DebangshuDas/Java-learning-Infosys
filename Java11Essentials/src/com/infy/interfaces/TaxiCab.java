package com.infy.interfaces;

public class TaxiCab extends Car implements PublicTransport{
    public double calculateFare() {    // Implementing interface's method
        double billAmount = MIN_AMOUNT + (RATE * getTravelDistance());
        return billAmount;
    }
    public double getTravelDistance() {
        // Calculates and returns the distance traveled
    	return 1.0;
    }
}
