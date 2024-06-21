package Assignement;

import java.util.Scanner;

//To find Armstrong Number between two given number.
public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Please enter number to find armstrong no:");
        Scanner inputNum1 = new Scanner(System.in);
        int num = inputNum1.nextInt();

        int temp = num;
        int digit = 0;

        while(temp != 0){
            temp = temp/10;
            digit++;

        }
        System.out.println(digit);

        temp = num;
        int remainder= 0;
        int armstrong =0;
        while(temp != 0){
            remainder = temp % 10;
            armstrong = (int) Math.pow(remainder,digit) + armstrong;
            temp = temp /10;
        }
        if(armstrong == num){
            System.out.println("the number is armstrong");
        }else{
            System.out.println("it is not");
        }


    }
}
