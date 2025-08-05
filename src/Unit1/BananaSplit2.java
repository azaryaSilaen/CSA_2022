package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class BananaSplit2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Word: ghost
        //Text to insert: BOO
        //Text to search: o
        //BananaSplit: ghBOOost

        System.out.print("Word: ");
        String word = input.nextLine();
        System.out.print("Text to insert: ");
        String insertText = input.nextLine();
        System.out.print("Text to search: ");
       String insertAt = input.nextLine();

        //system
        String firstHalf = word.substring(0,word.indexOf(insertAt));
        String secondHalf = word.substring(word.indexOf(insertAt));

        //output
        //output
        System.out.print("BananaSplit: " + firstHalf + insertText + secondHalf);
    }
}
