package Unit2;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input
        System.out.print("Enter the dividend: ");
        int dividend = input.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        //output
        if (divisor == 0) {
            System.out.println(dividend + " is not divisible by " + divisor + "!");
        }
        else if (dividend % divisor == 0) {
            System.out.println(dividend + " is divisible by " + divisor + "!");
        }
        else {
            System.out.println(dividend + " is not divisible by " + divisor + "!");
        }

    }
}
