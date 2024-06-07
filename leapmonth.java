/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.leap_work;

/**
 *
 * @author Admin
 */
public class leapmonth {
    
    // Declare the variables
    private int year;
    private int month;

    // Constructor
    public leapmonth(int year, int month) {
        this.year = year;
        this.month = month;
    }

    // Method to check if the month is a leap month
    public boolean isLeapMonth() {
        boolean isLeapMonth = (year % 4 == 0);
        isLeapMonth = isLeapMonth && (month % 100 != 0);
        isLeapMonth = isLeapMonth || (month % 400 == 0);
        return isLeapMonth;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Example usage
        leapmonth lm = new leapmonth(2024, 2); // Example year and month
        if (lm.isLeapMonth()) {
            System.out.println("The given month is a leap month.");
        } else {
            System.out.println("The given month is not a leap month.");
        }
    }
}


