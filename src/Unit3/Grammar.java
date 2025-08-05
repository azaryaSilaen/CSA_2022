package Unit3;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class Grammar
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        // Ask the user to enter a sentence that uses the word 2 instead of to.
        System.out.println("enter a sentence that uses the word 2 instead of to");
        String sentence = kb.nextLine();

        // Call the method useProperGrammar to process the string according to
        // the directions.
        System.out.println(useProperGrammar(sentence));
    }

    public static String useProperGrammar(String theText)
    {
        // Process the sentence that is sent to this method and replace every 2
        // with the word to.
        int count = 0;
        for (int i = 0; i < theText.length(); i++) {
            if (theText.substring(i, i+1).equals("2")) {
                count++;
            }
        }
        return theText.replaceAll("2","to") + "\nFixed " + count + " grammatical errors:";

    }
}

