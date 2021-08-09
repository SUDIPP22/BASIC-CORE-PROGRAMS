package com.bridgelabz;

import java.util.Scanner;

public class SwapOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter The Second Number : ");
        int b = sc.nextInt();
        System.out.println("Before Swapping The Numbers are : " +a+ " , " +b);
        int c;
        // Swapping concept
        c = a;
        a=b;
        b=c;
        System.out.println("After Swapping The Numbers are : " +a+ " , " +b);
        sc.close();
    }
}
