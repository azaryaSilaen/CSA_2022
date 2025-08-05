package Unit2;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class SalmonSpawn {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("What's the month of the year? (in number)");
        int month = kb.nextInt();

        //“Spring spawning season”, “Fall spawning season”, or “Not spawning season”.
        //The spring spawning season lasts from March to June (month 3 - 6).
        // The fall spawning season lasts from September to November (month 9 - 11).

        if (month >= 3 & month <= 6) {
            System.out.println("it's Spring spawning season");
        }
        else if (month >= 9 & month <= 11) {
            System.out.println("it's Fall spawning season");
        }
        else {
            System.out.println("it's Not spawning season");
        }
    }
}
