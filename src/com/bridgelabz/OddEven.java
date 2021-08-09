package com.bridgelabz;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int value = sc.nextInt();
        // Even-Odd Logic Build
        if ((value % 2) == 0) {
            System.out.println("Your Given Number " + value + " is Even Number");
        } else
            System.out.println("Your Given Number " + value + " is Odd Number");
        sc.close();
    }
}
