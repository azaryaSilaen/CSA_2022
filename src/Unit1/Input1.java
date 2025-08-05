package Unit1;/*
Author: Azarya Silaen
 */

//First step, import Scanner
import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {

        //create Scanner object
        Scanner information = new Scanner (System.in);

        //input
        String firstName;
        String lastName;

        System.out.print("Name = ");
        firstName = information.nextLine();
        System.out.print("Last name = ");
        lastName = information.nextLine();
        System.out.println("Full name = " + firstName + " " + lastName);


    }
}
