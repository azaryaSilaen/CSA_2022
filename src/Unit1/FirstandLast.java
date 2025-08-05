package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Locale;
import java.util.Scanner;

public class FirstandLast {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //name: Mary
        //Last name: Poppins
        //First and Last: ms

        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Last name: ");
        String lName = input.nextLine();

        //process
        String firstLetter = name.substring(0,1);
        firstLetter = firstLetter.toLowerCase();
        String lastLetter = lName.substring(lName.length()-1).toLowerCase();

        //output
        System.out.println("First and Last: " + firstLetter + lastLetter);
    }
}
