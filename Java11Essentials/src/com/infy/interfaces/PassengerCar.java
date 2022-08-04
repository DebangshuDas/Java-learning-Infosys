package com.infy.interfaces;

public interface PassengerCar {
    int PRICE_PER_KM = 30;
    default double calculateFare(double distanceTravelled) {
        return PRICE_PER_KM*distanceTravelled;
    }
    static double convertToDollars(double rupees) {
        return rupees/70;
    }
}

