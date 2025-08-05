package Unit3;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number or 0 to quit: ");
        int number = kb.nextInt(); //first number
        int min = number;
        int max = number;
        while (number != 0) {
            System.out.println("Results so far:" );

            if (number > max) //max
            {
                max = number;
            }
            if (number < min) // min
            {
                min = number;
            }
            System.out.println("Largest number: " + max);
            System.out.println("Smallest number: " + min);

            System.out.print("Enter a number or 0 to quit: ");
            number = kb.nextInt();
        }

    }
}
