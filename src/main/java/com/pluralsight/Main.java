package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        //Test Room
        Rooms room = new Rooms(2, false, false, 124.00);

        System.out.println(">>> Initial Room Availability <<<");
        System.out.println("Room available? " + room.isAvailable());

        System.out.println("----------------------------------");

        System.out.println(">>> Guest Checks In <<<");
        room.checkIn();
        System.out.println("----------------------------------");

        System.out.println(">>> Guest Checks Out <<<");
        room.checkOut();
        System.out.println("----------------------------------");

        System.out.println(">>> Housekeeping Cleans Room <<<");
        room.cleanRoom();
        System.out.println("Room available? " + room.isAvailable());
        System.out.println("==================================\n");

        //test res
        Reservation reservation = new Reservation("King", 3, true);
        System.out.printf("Reservation total for %d nights: $%.2f%n",reservation.getNumberOfNights(), reservation.getReservationTotal());
        System.out.println();


        //test employee
        Employees emp = new Employees(101, "John Doe", "Housekeeping", 17, 0);

        emp.punchIn(9.0);
        emp.punchOut(17.5);
        emp.punchIn(8.5);
        emp.punchOut(16.0);

        System.out.println("Employee: " + emp.getFullName());
        System.out.printf(
                "Total Pay: $%.2f%nRegular Hours: %.2f%nOvertime Hours: %.2f%n",
                emp.getTotalPay(),
                emp.getRegularHoursWorked(),
                emp.getOvertimeHours());
        System.out.println("----------------------------------");

        //testing Hotel Class
        Hotel hotel = new Hotel("Sunset Inn", 5, 10); // name, suites, basic rooms

        System.out.println(">>> Hotel Created: " + hotel.getName());
        System.out.println("Available Suites: " + hotel.getAvailableSuites());
        System.out.println("Available Basic Rooms: " + hotel.getAvailableRooms());
        System.out.println("----------------------------------");

        hotel.bookRoom(2, true);   // Book 2 suites
        hotel.bookRoom(3, false);  // Book 3 basic rooms
        hotel.bookRoom(10, true);  // Try to overbook suites

        System.out.println("----------------------------------");
        System.out.println("Suites left: " + hotel.getAvailableSuites());
        System.out.println("Basic rooms left: " + hotel.getAvailableRooms());
        System.out.println("==================================");

}
}
