package Unit2;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class U2_7 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //90 - 100 	A
        //80 - 89	B
        //70 - 79	C
        //60 - 69	D
        //Below 60	E

        System.out.println("Welcome to Letter Grade");
        System.out.println(" ");

        //input
        System.out.print("Enter the percentage: ");
        int grade = kb.nextInt();


        //output

        //error
        if (grade < 0 || grade > 100) {
            System.out.println("ERROR 404: Invalid grade number");
            System.out.println("percentage must be in the range of 0-100");
        }

        else {

            System.out.print("The corresponding letter grade is: ");

            //grade

            if (grade == 0) {
                System.out.print("damn bro, you failed that bad?");
            }
            else if (grade < 60) {
                System.out.print("E");
            }
            else if (grade < 70) {
                System.out.print("D");
            }
            else if (grade < 80) {
                System.out.print("C");
            }
            else if (grade < 90) {
                System.out.print("B");
            }
            else if (grade <= 100) {
                System.out.print("A");
            }
        }

    }
}
