package Unit2;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class NoFirstandLast {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = kb.nextLine();

        System.out.println("New word: " + word.substring(1,(word.length()-1)));
    }
}
