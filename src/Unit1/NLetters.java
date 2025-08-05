package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class NLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Text: Marylin
        //Number: 3
        //N letters: MAR

        //input
        System.out.print("Text: ");
        String text = input.nextLine();
        System.out.print("Number: ");
        int number = input.nextInt();

        //System
        String nLetters = text.substring(0, number).toUpperCase();

        //output
        System.out.println((number + " letters: ") + nLetters);

    }
}
