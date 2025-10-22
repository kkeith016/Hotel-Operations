package com.pluralsight;

public class Main {

    public static void main(String[] args) {

        Employee kay = new Employee(1, "Kay", "HR", 40.50, 0);

        kay.punchTimeCard(6.00);

        kay.punchTimeCard(10.00);

        System.out.println(kay.getRegularHours());
        System.out.println(kay.getTotalPay());
    }
}