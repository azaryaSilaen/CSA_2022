package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class pigLatin {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Welcome to Pig Latin");
        //input
        System.out.print("\nEnter a word: ");
        String word = kb.nextLine();

        //system
        char firstChar = word.charAt(0);
        String restoftheWord = word.substring(1);

        //output
        System.out.print(word + " in pig latin = " + restoftheWord + firstChar + "ay");
    }
}
