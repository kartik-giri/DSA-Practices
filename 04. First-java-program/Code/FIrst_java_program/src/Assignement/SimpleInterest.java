package Assignement;

import java.util.Scanner;
//Question Write a program to input principal, time, and rate (P, T, R) from the user and
//find Simple Interest.

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Please enter principal amount:");
        Scanner inputPrincipal = new Scanner(System.in);
        int p = inputPrincipal.nextInt();
        System.out.println("Please enter rate:");
        Scanner inputRate = new Scanner(System.in);
        int r = inputRate.nextInt();
        System.out.println("Please enter time:");
        Scanner inputTime = new Scanner(System.in);
        int t = inputTime.nextInt();

        // Simple interest formula S.I. = (P × R × T)/100
        int simpleInterest = (p * r * t )/100;
        System.out.println("The simple interest is:" + simpleInterest);


    }
}
