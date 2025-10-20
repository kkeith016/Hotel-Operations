package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        //Test Room
        Rooms room = new Rooms(2,false,false,124.00);
        System.out.println("Rooms Available: " + room.isAvailable());
        System.out.println();

        //test res
        Reservation reservation = new Reservation("King", 3, true);
        System.out.println("Reservation total: $" + reservation.getReservationTotal());
        System.out.println();

        //test employee
        Employees employees = new Employees(101, "John Doe","Housekeeping",17, 49);
        System.out.println("Employee: " + employees.getFullName());
        System.out.printf("Total Pay: $" + employees.getTotalPay()+"\n Reg Hours:" + employees.getRegularHoursWorked() +"\n Overtime:" + employees.getOvertimeHours());
        System.out.println();






    }
}
