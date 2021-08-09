package com.bridgelabz;

import java.util.Scanner;

public class PowerOf2Formula {
    // Checking the given input since 2^31 overflows INTEGER
    static boolean checkPowerDigit(int N){
        return N >= 0 && N < 31;
    }
    // Check for logics
    static void checkForLogic(int N) {
        int result = 1;
        for (int i = 1; i <= N; i++) {
            result = result * 2;
        }
            System.out.println(2 + "^" + N + " is : " + result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Desired Power");
        int N = sc.nextInt();
        sc.close();
        if (checkPowerDigit(N))
            checkForLogic(N);
    }
}
