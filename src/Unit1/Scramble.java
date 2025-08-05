package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class Scramble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Word: Marylin
        //Scrambled: ylinMar

        //input
        System.out.print("Word: ");
        String word = input.nextLine();

        //System
        String firstHalf = word.substring(0,word.length()/2);
        String secondHalf = word.substring(word.length()/2);

        System.out.print("Scrambled: " + secondHalf + firstHalf);
    }
}
