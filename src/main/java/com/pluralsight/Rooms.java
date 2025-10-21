package com.pluralsight;

public class Rooms {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Rooms(int numberOfBeds, boolean dirty, boolean occupied, double price) {
        this.numberOfBeds = numberOfBeds;
        this.dirty = dirty;
        this.occupied = occupied;
        this.price = price;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }
    public boolean isAvailable() {
        return !occupied && !dirty;
    }
    public void checkIn() {
        if (isOccupied()) {
            occupied = true;
            dirty = true;
            System.out.println("Guest checked in successfully.");
        } else {
            System.out.println("Room not available. It may be dirty or occupied.");
        }
    }
    public void checkOut() {
        if (occupied) {
            occupied = false;
            dirty = true;
            System.out.println("Guest checked out. Room needs cleaning.");
        } else {
            System.out.println("Cannot check out — room is not occupied.");
        }
    }
    public void cleanRoom() {
        if (dirty) {
            dirty = false;
            System.out.println("Room cleaned and ready for next guest.");
        } else {
            System.out.println("Room is already clean.");
        }
    }
}
