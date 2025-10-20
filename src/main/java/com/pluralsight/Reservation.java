package com.pluralsight;

public class Reservation {
    private String roomType; // KING or DOUBLE
    private int numberOfNights;
    private double pricePerNight;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        setRoomType(roomType); // automatically sets pricePerNight
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType.toUpperCase();

        switch (this.roomType) {
            case "KING":
                this.pricePerNight = 139.0;
                break;
            case "DOUBLE":
                this.pricePerNight = 124.0;
                break;
            default:
                System.out.println("Error: Invalid room type.");
                this.pricePerNight = 0;
        }

        // Apply weekend increase
        if (isWeekend) {
            this.pricePerNight = this.pricePerNight * 1.10;
        }
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
        setRoomType(this.roomType); // recalc price if weekend status changes
    }

    public double getReservationTotal() {
        return pricePerNight * numberOfNights;
    }
}