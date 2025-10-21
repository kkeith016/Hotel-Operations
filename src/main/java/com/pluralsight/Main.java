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

    }

            //testing Hotel Class

}
