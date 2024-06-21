package Assignement;

import java.util.Scanner;
// To find out whether the given String is Palindrome or not.
public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("Please enter string to check palindrome:");
        Scanner inputString = new Scanner(System.in);
        String word = inputString.nextLine();

        String original = word;
        String reverse = "";

        for(int i =1; i <=word.length(); i++){
            reverse = reverse + word.charAt(word.length()-i);
        }
        //In Java, == is an operator that compares the references or memory addresses of objects to determine
        //if they are the same, whereas . equals() is a method that compares the contents of the objects to check for value equality.
        if(original.equals(reverse)){
            System.out.println("True string is palindrome");
        }
        else{
            System.out.println("False string is not palindrome");
        }

    }
}
