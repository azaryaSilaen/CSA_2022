package Unit3;/*
Author: Azarya Silaen
 */

import java.util.Scanner;
public class Palindromes
{

    private static String word;


    /**
     * This program lets the user input some text and
     * prints out whether or not that text is a palindrome.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        //input
        System.out.print("Type in your text: ");
        word = kb.nextLine();

        //removing whites spaces
        word = word.replaceAll(" ", "");

        //result
        if (isPalindrome(word)) {
            System.out.println("Your word is a palindrome!");
        }
        else {
            System.out.println("Not a palindrome :(");
        }
        // Create user input and let user know whether their word is a palindrome or not!

    }

    /**
     * This method determines if a String is a palindrome,
     * which means it is the same forwards and backwards.
     *
     * @param text The text we want to determine if it is a palindrome.
     * @return A boolean of whether or not it was a palindrome.
     */
    public static boolean isPalindrome(String text)
    {
        return text.equalsIgnoreCase(reverse(text));
    }

    /**
     * This method reverses a String.
     *
     * @param text The string to reverse.
     * @return The new reversed String.
     */
    public static String reverse(String text)
    {

        //reverse text
        String reverseText = "";
        for (int i = text.length()-1; i >=0; i--)
        {
            reverseText += text.substring(i, i+1);
        }
        return reverseText;
    }

}
