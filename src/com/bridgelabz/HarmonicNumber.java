package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The N-th number : ");
        int N = sc.nextInt();
        sc.close();
        // variable
        double num = 0;
        // checking logic
        if (N != 0) {
            for (double i = 1; i <= N; i++) {
                num += (1 / i);
            }
            System.out.println("The N-th Harmonic value is : " + num);
        } else
            System.out.println("You have To assigned the number greater than 0");
    }
}
