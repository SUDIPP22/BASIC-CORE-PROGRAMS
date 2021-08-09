package com.bridgelabz;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
    static void getLargestNumber(int x1, int x2, int x3) {
        System.out.println("Largest Number is : ");
        if (x1 > x2 && x1 > x3) {
            System.out.println(x1);
        } else if (x2 > x1 && x2 > x3) {
            System.out.println(x2);
        } else
            System.out.println(x3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter The Second Number : ");
        int n2 = sc.nextInt();
        System.out.println("Enter The Third Number : ");
        int n3 = sc.nextInt();
        getLargestNumber(n1, n2, n3);
    }
}
