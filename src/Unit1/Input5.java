package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class Input5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //Name: John Doe
        //Km segment 1: 2.5
        //Km segment 2: 1.7
        //Km segment 3: 4.8
        //
        //John Doe total run: 9.0

        System.out.print("Name: ");
        String name = kb.nextLine();
        System.out.print("Km segment 1: ");
        double km1 = kb.nextDouble();
        System.out.print("Km segment 2: ");
        double km2 = kb.nextDouble();
        System.out.print("Km segment 1: ");
        double km3 = kb.nextDouble();
        System.out.println("\n" + name + " total run: " + (km1+km2+km3));
    }
}
