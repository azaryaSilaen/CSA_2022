package Unit2;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class Berries {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the initial of the berry:");
        char fWord = kb.next().charAt(0);

        //‘E’ for Elderberry
        //‘G’ for Gooseberry
        //‘L’ for Lingonberry

        if (fWord == 'E') {
            System.out.println("You ordered Elderberry");
        } else if (fWord == 'G') {
            System.out.println("You ordered Gooseberry");
        } else if (fWord == 'L') {
            System.out.println("You ordered Lingonberry");
        } else {
            System.out.println("Berry not recognized");
        }
    }
}
