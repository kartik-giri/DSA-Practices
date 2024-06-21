package Assignement;

import java.util.Scanner;
//To calculate Fibonacci Series up to n numbers.
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Please enter number to print fibonacci series:");
        Scanner inputNum = new Scanner(System.in);
        int num = inputNum.nextInt();

        int num1 = 0;
        int num2 = 1;
        int nextnum;
        System.out.println(num1);
        System.out.println(num2);

        for(int i=2; i <num; i++){
            nextnum = num1 + num2;
            System.out.println(nextnum);
            num1 = num2;
            num2 = nextnum;
        }
    }
}
