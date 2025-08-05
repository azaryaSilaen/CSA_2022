package Unit2;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

import static Unit2.RandomNum.Int;

public class Roulette {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Play - 1");
        System.out.println("Quit - 0");
        System.out.print("Enter your choice: ");
        int choice = kb.nextInt();
        System.out.println(" ");

        if (choice == 0) {
            System.out.println("You're chicken!");
        }

        else if (choice == 1) {
          int number1 = Int(1,6);
          int number2 = Int(1,6);
          int number3 = Int(1,6);

            System.out.println(number1 + " " + number2 + " " + number3);

            if (number1 == number2 & number1 == number3) {
                System.out.println("Jackpot! You got 1000 points");
            } else if (number1 == number2 | number2 == number3 | number1 == number3) {
                System.out.println("You got 100 points!");
            } else {
                System.out.println("better luck next time");
            }
        }
        else {
            System.out.println("Wrong input");
        }
    }
}
