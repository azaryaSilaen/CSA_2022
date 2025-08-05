package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Enter time in minutes: 135
        //The time is: 2:15

        System.out.println("\nWelcome to Time Conversion");
        System.out.print("\nEnter time in minutes: ");
        int minute = input.nextInt();

        if (minute % 60 < 10) {
            System.out.println("The time is: " + minute / 60 + ":0" + minute % 60);
        } else {
            System.out.println("The time is: " + minute / 60 + ":" + minute % 60);
        }
    }
}
