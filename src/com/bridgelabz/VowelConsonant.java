package com.bridgelabz;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet : ");
        String str = sc.next();
        if (str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u")) {
            System.out.println("Your given alphabet " +str+ " is Vowel");
        }
        else
            System.out.println("Your given alphabet " +str+ " is Consonant");
    }
}
