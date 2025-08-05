package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class Azarya_U1SA_Black {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Welcome to Three-word Phrase");
        //input information
        System.out.print("\nEnter a three-word phrase: ");
        String phrase1 = kb.nextLine();
        System.out.print("Enter a three-word phrase: ");
        String phrase2 = kb.nextLine();

        //variables (for words)
        String firstWord1 = phrase1.substring(0,phrase1.indexOf(" "));
        String secondWord1 = phrase1.substring(phrase1.indexOf(" ")+1, phrase1.lastIndexOf(" "));
        String thirdWord1 = phrase1.substring(phrase1.lastIndexOf(" ")+1);

        String firstWord2 = phrase2.substring(0,phrase2.indexOf(" "));
        String secondWord2 = phrase2.substring(phrase2.indexOf(" ")+1, phrase2.lastIndexOf(" "));
        String thirdWord2 = phrase2.substring(phrase2.lastIndexOf(" ")+1);

        //output data
        System.out.print("\nPhrase Summary");
        System.out.format("\n%-20s %-8s %-8s %-8s %-8s %-10s", "Phrases", "length", "1stWord", "2ndWord", "3rdWord", "Monogram");
        System.out.format("\n%-20s %-8s %-8s %-8s %-8s %-10s",
                phrase1,
                phrase1.length(),
                firstWord1,
                secondWord1,
                thirdWord1,
                phrase1.substring(0,1).toUpperCase() +
                secondWord1.substring(secondWord1.length()-1).toLowerCase() +
                thirdWord1.substring(0,1).toUpperCase());
        System.out.format("\n%-20s %-8s %-8s %-8s %-8s %-10s",
                phrase2,
                phrase2.length(),
                firstWord2,
                secondWord2,
                thirdWord2,
                phrase2.substring(0,1).toUpperCase() +
                        secondWord2.substring(secondWord2.length()-1).toLowerCase() +
                        thirdWord2.substring(0,1).toUpperCase());


    }
}
