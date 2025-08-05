package Unit3;/*
Author: Azarya Silaen
 */

import Unit2.RandomNum;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int password = RandomNum.Int(9999,10000);

        System.out.print("Enter your PIN: ");
        int guess = kb.nextInt();
        int counter = 1;
        while (guess != password & counter < 3)  {
            System.out.println(3-counter + " tries left");
            System.out.print("Enter your PIN: ");
            guess = kb.nextInt();
            counter++;
        }

        if (guess != password) System.out.println("Incorrect password, your card has been blocked");
        else System.out.println("Welcome to the ATM!");
    }
}
