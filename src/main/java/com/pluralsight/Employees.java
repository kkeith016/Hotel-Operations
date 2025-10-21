package com.pluralsight;

public class Employees {
    private int employeeId;
    private String fullName;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startingTime;

    public Employees(int employeeId, String fullName, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getRegularHoursWorked() {
        if (hoursWorked > 40) {
            return 40;
        } else {
            return hoursWorked;
        }
    }
    public double getOvertimeHours(){
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        }
        else  {
            return 0;
        }
    }
    public double getTotalPay() {
        double regularPay = getRegularHoursWorked() *  payRate;
        double overtimePay = getOvertimeHours() * payRate * 1.5;
        return regularPay + overtimePay;
    }
    public void punchIn(double time) {
        if (startingTime == 0) { // only punch in if not already working
            startingTime = time;
            System.out.println(fullName + " punched in at " + time);
        } else {
            System.out.println(fullName + " is already punched in!");
        }
    }

    public void punchOut(double time) {
        if (startingTime != 0) { // only punch out if they punched in first
            double worked = time - startingTime;
            hoursWorked += worked;
            System.out.println(fullName + " punched out at " + time + " and worked " + worked + " hours.");
            startingTime = 0; // reset for next shift
        } else {
            System.out.println(fullName + " hasn't punched in yet!");
        }
    }
}


