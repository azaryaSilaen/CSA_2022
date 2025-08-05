package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Enter a 2 digit number: 56
        //Ones-place digit: 6
        //Tens-place digit: 5
        //*Challenge: make it a 3-digit number

        System.out.print("Enter a 2 digit number: ");
        int digit2 = input.nextInt();
        System.out.println("\nOnes-place digit: " + digit2%10 );
        System.out.println("Tens-place digit: " + digit2/10);

        System.out.print("\nEnter a 3 digit number: ");
        int digit3 = input.nextInt();
        System.out.println("\nOnes-place digit: " + digit3%10);
        System.out.println("Tens-place digit: " + digit3%100/10);
        System.out.println("Hundreds-place digit: " + digit3/100);
    }
}
