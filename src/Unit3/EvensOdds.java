package Unit3;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class EvensOdds {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter minimum: ");
        int minimumStart = kb.nextInt();
        System.out.print("Enter Maximum: ");
        int maximum = kb.nextInt();

        int minimum = minimumStart;



        System.out.println("\nOdd numbers");
        while (minimum <= maximum) {
            if (minimum%2 != 0) {
                System.out.println(minimum);
                minimum+=2;
            }
            else {
                minimum++;
            }

        }

        System.out.println("\nEven numbers");
        while (minimumStart <= maximum) {
            if (minimumStart%2 == 0) {
                System.out.println(minimumStart);
                minimumStart+=2;
            }
            else {
                minimumStart++;
            }

        }
    }
}
