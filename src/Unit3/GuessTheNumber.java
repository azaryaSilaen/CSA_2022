package Unit3;/*
Author: Azarya Silaen
 */

import Unit2.RandomNum;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        //Enter minimum: 1
        //Enter maximum: 10
        //A secret number between 1 to 10 has been stored
        //
        //Enter your guess: 8
        //Enter your guess: 7
        //Enter your guess: 3
        //
        //The secret number is 3
        //You made 3 guesses

        System.out.print("Enter minimum: ");
        int min = kb.nextInt();
        System.out.print("Enter maximum: ");
        int max = kb.nextInt();
        int random = RandomNum.Int(min, max);
        System.out.println("A secret number between " + min + " to " + max + " has been stored");

        System.out.print("Enter your guess: ");
        int guess = kb.nextInt();

        int tries = 1;
        while (guess != random ) {
            System.out.print("Enter your guess: ");
            guess = kb.nextInt();
            tries++;
        }

        System.out.println("The secret number is " + random);
        System.out.println("You made " + tries + " guesses");

    }
}
