package com.pluralsight;

public class Hotel {
    private int numberOfSuites, numberOfRooms, bookedSuites, bookedBasicRooms;
    private String name;

    Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedBasicRooms = 0;
        this.bookedSuites = 0;
    }

    Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedBasicRooms = bookedBasicRooms;
        this.bookedSuites = bookedSuites;
    }

    /**
     * The bookRoom method should determine if there are enough rooms available
     * and update the booked inventory if they are. The method should return
     * true/false based on whether the rooms were able to be booked
     * @param numberOfRooms
     * @param isSuite
     * @return
     */
    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite) {
            if (getAvailableSuites() >= numberOfRooms) {
                this.bookedSuites += numberOfRooms;
                return true;
            }
        } else {
            if (getAvailableRooms() >= numberOfRooms) {
                this.bookedBasicRooms += numberOfRooms;
                return true;
            }
        }
        return false;
    }

    public int getAvailableRooms() {
        return this.numberOfRooms - this.bookedBasicRooms;
    }

    public int getAvailableSuites() {
        return this.numberOfSuites - this.bookedSuites;
    }

}