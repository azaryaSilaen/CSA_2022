package Unit1;/*
Author: Azarya Silaen
 */

import Unit2.RandomNum;

import java.util.Scanner;

public class Username {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        //Name:  Mery
        //Last name: TELLEZ
        //Username: mtellez

        System.out.print("Name: ");
        String name = input.nextLine();
        String firstNameInitial = name.substring(0,1).toLowerCase();
        System.out.print("Last name: ");
        String lastName = input.nextLine().toLowerCase();
        System.out.println("Username: " + firstNameInitial + lastName);
        System.out.println(RandomNum.Int(50,25));
    }
}
