package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class Azarya_U1SA_Blue {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Welcome to Books Borrowed");

        //input information
        System.out.print("\nEnter student first name: ");
        String firstName = kb.nextLine();
        System.out.print("Enter student last name: ");
        String lastName = kb.nextLine();
        System.out.print("Enter gender: ");
        String gender = kb.nextLine();
        System.out.print("Enter ID Number: ");
        int idNumber = kb.nextInt();
        System.out.println();

        //input data
        System.out.print("Enter number of books borrowed: ");
        int books = kb.nextInt();
        System.out.print("Enter number of days over due: ");
        int days = kb.nextInt();
        System.out.print("Enter weekly charges per book IDR: ");
        double weekCharges = kb.nextDouble();
        System.out.print("Enter daily charges per book IDR: ");
        double dailyCharges = kb.nextDouble();
        System.out.println();

        //output information
        System.out.println("Student information");
        System.out.println("Full name: " + firstName + " " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("ID Number: " + idNumber);
        System.out.println();

        //output data
        System.out.println("Library Account Information");
        System.out.println("Number of books borrowed: " + books);
        System.out.println("Number of weeks lapsed: " + days/7);
        System.out.println("Number of days lapsed: " + days%7);
        System.out.println();

        //output charges
        System.out.println("Total weekly charges IDR: " + (days/7)*weekCharges*books);
        System.out.println("Total daily charges IDR: " + (days%7)*dailyCharges*books);
        System.out.println("TOTAL CHARGES IDR: " + ((days/7)*weekCharges*books + (days%7)*dailyCharges*books));

    }
}
