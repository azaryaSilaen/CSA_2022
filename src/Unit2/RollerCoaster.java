package Unit2;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class RollerCoaster {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("How tall are you? (in inches)");
        double tall = kb.nextDouble();
        System.out.println("How old are you?");
        int age = kb.nextInt();

        if (tall >= 42 && age >= 9) {
            System.out.println("Welcome aboard!");
        }
        else {
            System.out.println("Sorry, you are not eligible to ride");
        }
    }
}
