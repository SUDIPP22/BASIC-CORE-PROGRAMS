package com.bridgelabz;
import java.util.Scanner;

public class LeapYear {
    // Checking The Given Input is four digit or not
    static boolean checkYearDigit(int year) {
        return year > 999;
    }
     // Logic Checking
    static void checkForLeapYear(int year) {
        if (((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0)))     // Condition For checking Leap Year
            System.out.println(year + " is a Leap Year ");
        else
            System.out.println(year + " is not a Leap Year ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Year : ");
        int year = sc.nextInt();
        sc.close();
        if (checkYearDigit(year))
            checkForLeapYear(year);
        else
            System.out.println("Please Enter Valid Four Digit Year !!!");
    }
}
