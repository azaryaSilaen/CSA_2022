package Unit3;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class U3_3 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter minimum: ");
        int minimum = kb.nextInt();
        System.out.print("Enter Maximum: ");
        int maximum = kb.nextInt();

        while (minimum <= maximum) {
            if (minimum%2 != 0) System.out.println(minimum);
            minimum++;
        }
    }
}
