package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {
    public void getPrice_should_be139_when_roomTypeIsKing() {
        // arrange
        Reservation reservation = new Reservation("King", 2, false);
        double expectedPrice = 139.00;

        // act
        double actualPrice = reservation.getPrice();

        // assert
        assertEquals(expectedPrice, actualPrice);
    }

    public void getPrice_should_be124_when_roomTypeIsDouble() {
        // arrange
        Reservation reservation = new Reservation("Double", 3, false);
        double expectedPrice = 124.00;

        // act
        double actualPrice = reservation.getPrice();

        // assert
        assertEquals(expectedPrice, actualPrice);
    }

    public void getReservationTotal_should_applyWeekendUpcharge_when_isWeekendTrue() {
        // arrange
        Reservation reservation = new Reservation("King", 2, true);
        // price = 139; weekend adds 10% (×1.1)
        double expectedTotal = 2 * (139.00 * 1.1);

        // act
        double actualTotal = reservation.getReservationTotal();

        // assert
        assertEquals(expectedTotal, actualTotal);
    }

    public void getReservationTotal_should_notApplyUpcharge_when_isWeekendFalse() {
        // arrange
        Reservation reservation = new Reservation("Double", 3, false);
        // price = 124; no upcharge
        double expectedTotal = 3 * 124.00;

        // act
        double actualTotal = reservation.getReservationTotal();

        // assert
        assertEquals(expectedTotal, actualTotal);
    }
    public void setRoomType_should_updatePriceToKingRate() {
        // arrange
        Reservation reservation = new Reservation("Double", 1, false);
        double expectedPrice = 139.00;

        // act
        reservation.setRoomType("King");
        double actualPrice = reservation.getPrice();

        // assert
        assertEquals(expectedPrice, actualPrice);
    }
    public void setRoomType_should_updatePriceToDouble() {
        //arrange
        Reservation reservation = new Reservation("Double", 3, false);
        double expectedPrice = 139.00;

        //act
        reservation.setRoomType("Double");
        double actualPrice = reservation.getPrice();

        //assert
        assertEquals(expectedPrice, actualPrice);
    }
}