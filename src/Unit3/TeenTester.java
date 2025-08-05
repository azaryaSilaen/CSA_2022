package Unit3;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class TeenTester
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        // Create a new Teen object and print it out; see the Teen class file
        // to see how the constructor and toString method work.
        Teen myFriend = new Teen("Sonequa", "Martin-Green", 10, true);
        System.out.println(myFriend);

        // Ask the user to input a text message
        System.out.println("enter a text:");
        String text = kb.nextLine();

        // Call teenTalk method to translate the message to teen talk
        System.out.println(Teen.teenTalk(text));

    }


}

