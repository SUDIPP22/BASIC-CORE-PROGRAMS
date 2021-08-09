package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int value = sc.nextInt();
        System.out.print("The Prime Factors of " + value + " are : ");
        for (int i = 2; i < value; i++) {
            while (value % i == 0) {
                System.out.print(i + " , ");
                value = value / i;
            }
        }
        if (value > 2) {
            System.out.println(value);
        }
    }
}
