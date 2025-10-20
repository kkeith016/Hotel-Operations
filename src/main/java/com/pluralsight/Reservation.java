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
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType.toUpperCase();
        if (this.roomType.equals("KING")) {
            this.pricePerNight = 139.00;
        }
        else if (this.roomType.equals("DOUBLE")) {
            this.pricePerNight = 124.00;
        }
        else{
            System.out.println("Invalid Room Type");
        }
        if (isWeekend){
            this.pricePerNight = this.pricePerNight * 1.10;}
        else {
           this.pricePerNight = this.pricePerNight;
        }
    }

}
