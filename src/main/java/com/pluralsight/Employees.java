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
}


