package Unit2;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class FirstAndSecond {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //Enter a word: hello
        //Enter a word: java
        //new word: heva

        System.out.print("Enter a word: ");
        String word1 = kb.nextLine();
        System.out.print("Enter a word: ");
        String word2 = kb.nextLine();

        System.out.println("New word: " + word1.substring(0,word1.length()/2) + word2.substring(word2.length()/2));
    }
}
