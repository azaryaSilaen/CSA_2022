package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class BananaSplit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Word: ghost
        //Text to insert: BOO
        //Position: 2
        //BananaSplit: ghBOOost

        //input
        System.out.print("Word: ");
        String word = input.nextLine();
        System.out.print("Text to insert: ");
        String insertText = input.nextLine();
        System.out.print("Position: ");
        int insertIdx = input.nextInt();

        //system
        String firstHalf = word.substring(0,insertIdx);
        String secondHalf = word.substring(insertIdx);

        //output
        System.out.print("BananaSplit: " + firstHalf + insertText + secondHalf);
    }
}
