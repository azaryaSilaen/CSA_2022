package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class QuoteMachine {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //Enter a quote:
        //Oh the places you'll go!
        //Enter the author of the quote:
        //Dr. Seuss
        //"Oh the places you'll go!"
        //Dr. Seuss
        System.out.println("Welcome to Quote Machine");

        System.out.println("\nEnter a quote: ");
        String quote = kb.nextLine();
        System.out.println("Enter the author of the quote: ");
        String author = kb.nextLine();
        System.out.println("\"" + quote + "\"" + "\n" + author);
    }
}
