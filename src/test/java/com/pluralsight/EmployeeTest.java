package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    public void getRegularHours_should_returnAllHours_when_under40() {
        //arrange
        Employee employee = new Employee(1, "Beebear", "PetSupport", 20.00, 30.00);
        double expectedHours = 30.0;

        //act
        double actualHours = employee.getRegularHours();

        //assert
        assertEquals(expectedHours, actualHours);
    }
    public void getRegularHours_should_return40_when_over40() {
        // arrange
        Employee employee = new Employee(2, "Pumpkin", "Pet Therapist", 25.0, 45.0);
        double expectedHours = 40.0;

        // act
        double actualHours = employee.getRegularHours();

        // assert
        assertEquals(expectedHours, actualHours);
    }
    public void getOvertimeHours_should_returnExtraHours_when_over40() {
        // arrange
        Employee employee = new Employee(4, "Dan", "Finance", 25.0, 45.0);
        double expectedOvertime = 5.0;

        // act
        double actualOvertime = employee.getOvertimeHours();

        // assert
        assertEquals(expectedOvertime, actualOvertime);
    }
    public void getTotalPay_should_includeOvertimePay_when_over40() {
        // arrange
        Employee employee = new Employee(5, "Eve", "IT", 20.0, 45.0);
        double expectedPay = (20 * 40) + (20 * 1.5 * 5); // regular + overtime

        // act
        double actualPay = employee.getTotalPay();

        // assert
        assertEquals(expectedPay, actualPay);
    }
    public void punchInAndOut_should_addWorkedHours() {
        // arrange
        Employee employee = new Employee(6, "Frank", "Ops", 15.0, 0.0);
        employee.punchIn(8.0);  // 8 AM
        double expectedHours = 8.0;

        // act
        employee.punchOut(16.0); // 4 PM
        double actualHours = employee.getRegularHours();

        // assert
        assertEquals(expectedHours, actualHours);
    }
}
