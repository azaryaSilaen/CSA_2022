package Unit3;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class Letter {

        public static void main(String[] args)
        {

            Scanner kb = new Scanner(System.in);

            // Ask the user for 3 things: their word, letter they want to replace,
            // and replacing letter.

            System.out.print("Enter a word: ");
            String word = kb.nextLine();
            System.out.print("Enter the letter to be replaced: ");
            String replaced = kb.nextLine();
            System.out.print("Enter the new letter: ");
            String newLetter = kb.nextLine();

            // Call the method replaceLetter and pass all 3 of these items to it for
            // string processing.

            System.out.println(replaceLetter(word, replaced, newLetter));
        }

        // Modify this method so that it will take a third parameter from a user --
        // the String with which they want to replace letterToReplace
        //
        // This method should replace all BUT the first occurence of letterToReplace
        // You may find .indexOf to be useful, though there are several ways to solve this problem.
        // This method should return the modified String.
        public static String replaceLetter(String word, String letterToReplace, String newLetter)
        {
            int position = word.indexOf(letterToReplace);
            String newWord = word.substring(0, position+1);
            for(int i = position+1; i < word.length(); i++)
            {
                if(word.substring(i, i+1).equals(letterToReplace))
                {
                    newWord += newLetter;
                }
                else {
                    newWord += word.substring(i, i+1);
                }
            }
            return newWord;
        }
    }
