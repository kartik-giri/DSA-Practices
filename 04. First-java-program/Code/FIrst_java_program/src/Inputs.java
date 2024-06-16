import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Your name is "+ name);

        Scanner inputNo = new Scanner(System.in);
        System.out.println("Please enter your roll no:");
        int rollNo = inputNo.nextInt();
        System.out.println("Your roll no is:"+ rollNo);
    }
}
