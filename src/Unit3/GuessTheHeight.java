package Unit3;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class GuessTheHeight {
    // This is the height of Mt. Everest.
    static int everestHeight = 8848;
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {

        System.out.println("Do you know how tall Mt. Everest is?");
        System.out.println("See if you can guess the height in meters.");

        // This calls the static method guessTheHeight. Notice that the method is outside
        // of the main method.
        guessTheHeight();

    }

    public static void guessTheHeight()
    {
        System.out.print("Guess the height: ");
        int height = kb.nextInt();

        while (height != everestHeight) {
            System.out.println("That's not it!");
            System.out.print("Guess the height: ");
            height = kb.nextInt();
        }
        System.out.println("Right! Mt. Everest is 8848 meters tall!");


    }
}
