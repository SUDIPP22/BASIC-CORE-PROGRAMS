package com.bridgelabz;
import java.util.Scanner;

public class FlipCoin {
    // Checking Given Input is integer or not
    static boolean checkPositiveInteger(int tossCoin){
        return tossCoin > 0;
    }
    // Logic Statement
    static void getPercentage(int tossCoin){
        int isHead = 0;
        int isTail = 0;
        for (int j = 0; j < tossCoin ; j++) {
            double flipCoin = Math.random();
            if (flipCoin < 0.5)
                isTail ++;
            else
                isHead ++;
        }
        float percentageOfHeads = (isHead * 100f) / tossCoin;
        float percentageOfTails = (isTail * 100f) / tossCoin;
        System.out.println("Percentage of Head is : " +percentageOfHeads);      // Getting percentage of HEAD
        System.out.println("Percentage of Tail is : " +percentageOfTails);      // Getting percentage of TAIL
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times to flip coin : ");
        int tossCoin = sc.nextInt();
        sc.close();
        if (checkPositiveInteger(tossCoin))
            getPercentage(tossCoin);
        else
            System.out.println("Please Enter a Positive Integer !!!!");
    }
}
