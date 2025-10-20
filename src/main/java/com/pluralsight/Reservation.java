package com.pluralsight;

public class Reservation {
    private String roomType; //King, Double, Suite
    private int numberOfNights;
    private double pricePerNight;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, double pricePerNight, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.pricePerNight = pricePerNight;
        this.isWeekend = isWeekend;
    }

}
