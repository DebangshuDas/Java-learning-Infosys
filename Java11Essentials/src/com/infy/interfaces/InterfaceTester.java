package com.infy.interfaces;



public class InterfaceTester {
    public static void main(String[] args) {
        TaxiCab olaCar = new TaxiCab();
        // After travelling
        System.out.println("Your bill amount is: Rs." + olaCar.calculateFare());
    }
}



