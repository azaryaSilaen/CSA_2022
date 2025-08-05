package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class LocatingWord {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //input
        System.out.print("Enter a sentence: ");
        String sentence = kb.nextLine();
        System.out.print("Enter a word: ");
        String word = kb.nextLine();

        //output
        System.out.println(word + " is located at position " + sentence.indexOf(word));
    }
}
