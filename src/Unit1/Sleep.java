package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class Sleep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your birthdate:");
        System.out.print("Year: ");
        int year = input.nextInt();
        System.out.print("Month: ");
        int month = input.nextInt();
        System.out.println("Day: ");
        int day = input.nextInt();
        System.out.println("Enter today's date: ");
        System.out.print("Year: ");
        int yearToday = input.nextInt();
        System.out.print("Month: ");
        int monthToday = input.nextInt();
        System.out.println("Day: ");
        int dayToday = input.nextInt();
        System.out.println("you have been alive for: ");

        String test = "Hello World! World oh World";
        String theSame = test.replace("", "mama mia lozatos");
        System.out.print(theSame);

    }
}
