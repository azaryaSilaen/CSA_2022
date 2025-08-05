package Unit3;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class TaffyTester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //Starting Taffy Timer...
        //Enter the temperature: 40
        //
        //The mixture isn't ready yet.
        //Enter the temperature: 100
        //
        //The mixture isn't ready yet.
        //Enter the temperature: 200
        //
        //The mixture isn't ready yet.
        //Enter the temperature: 300
        //Your taffy is ready for the next step!

        System.out.println("Starting Taffy Timer...");

        System.out.print("Enter the temperature: ");
        int temp = kb.nextInt();

        while (temp < 270) {
            System.out.println("\nThe mixture isn't ready yet.");
            System.out.print("Enter the temperature: ");
            temp = kb.nextInt();
        }

        System.out.println("Your taffy is ready for the next step!");
    }
}
