import java.util.Scanner;
//Type casting and conversion
public class TypeConversion {
    public static void main(String[] args) {
        // Type conversion -> it is automatic
        Scanner input = new Scanner(System.in);
        float val = input.nextFloat();
        System.out.println(val);

//        Type Casting => it is manually just like we do in solidity
        int num = (int)(66.444f);
        System.out.println(num);

        //automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a); //257 % 256 =1 just like solidity
        System.out.println(b);

        // But byte 40*50 = 2000 how it is handling this big no than 256. The reason is that java automatically promote
        // the byte into int for this particular condition.
        byte c = 40;
        byte d = 50;
        byte e =100;
        int r = (40*50)/100;
        System.out.println(r);

        // But this will throw error because we are doing operation on byte, and it will not convert in int.
//        byte f = 20;
//        f = f*45;

        int number = 'A';
        System.out.println(number); //But it will give ascii value by type conversion.



    }
}
