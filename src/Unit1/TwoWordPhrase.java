package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class TwoWordPhrase {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Welcome to two-word phrases");
        //input
        System.out.print("\nEnter two-word phrase 1: ");
        String phrase1 = kb.nextLine();
        System.out.print("Enter two-word phrase 2: ");
        String phrase2 = kb.nextLine();
        System.out.print("Enter two-word phrase 3: ");
        String phrase3 = kb.nextLine();
        System.out.print("Enter two-word phrase 4: ");
        String phrase4 = kb.nextLine();
        System.out.print("Enter two-word phrase 5: ");
        String phrase5 = kb.nextLine();

        //output
        System.out.format("\n%-15s %-5s %-5s %-5s %-7s %-15s", "Phrases", "L", "IE", "M", "1stW", "2ndW");
        System.out.format("\n%-15s %-5s %-5s %-5s %-7s %-15s", phrase1, phrase1.length(), phrase1.substring(0,1).toLowerCase() + phrase1.substring(phrase1.length()-1).toLowerCase(), phrase1.charAt(phrase1.length()/2), phrase1.substring(0,phrase1.indexOf(" ")), phrase1.substring(phrase1.indexOf(" ")));
        System.out.format("\n%-15s %-5s %-5s %-5s %-7s %-15s", phrase2, phrase2.length(), phrase2.substring(0,1).toLowerCase() + phrase2.substring(phrase2.length()-1).toLowerCase(), phrase2.charAt(phrase2.length()/2), phrase2.substring(0,phrase2.indexOf(" ")), phrase2.substring(phrase2.indexOf(" ")));
        System.out.format("\n%-15s %-5s %-5s %-5s %-7s %-15s", phrase3, phrase3.length(), phrase3.substring(0,1).toLowerCase() + phrase3.substring(phrase3.length()-1).toLowerCase(), phrase3.charAt(phrase3.length()/2), phrase3.substring(0,phrase3.indexOf(" ")), phrase3.substring(phrase3.indexOf(" ")));
        System.out.format("\n%-15s %-5s %-5s %-5s %-7s %-15s", phrase4, phrase4.length(), phrase4.substring(0,1).toLowerCase() + phrase4.substring(phrase4.length()-1).toLowerCase(), phrase4.charAt(phrase4.length()/2), phrase4.substring(0,phrase4.indexOf(" ")), phrase4.substring(phrase4.indexOf(" ")));
        System.out.format("\n%-15s %-5s %-5s %-5s %-7s %-15s", phrase5, phrase5.length(), phrase5.substring(0,1).toLowerCase() + phrase5.substring(phrase5.length()-1).toLowerCase(), phrase5.charAt(phrase5.length()/2), phrase5.substring(0,phrase5.indexOf(" ")), phrase5.substring(phrase5.indexOf(" ")));
    }
}
