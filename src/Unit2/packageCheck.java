package Unit2;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class packageCheck {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //Enter package weight in Kg: 32
        //Enter package length in cm: 10
        //Enter package width in cm: 25
        //Enter package height in cm: 38
        //Too heavy

        //input
        System.out.print("Enter package weight in Kg: ");
        double weight = kb.nextInt();
        System.out.print("Enter package length in cm: ");
        double length = kb.nextInt();
        System.out.print("Enter package width in cm: ");
        double width = kb.nextInt();
        System.out.print("Enter package height in cm: ");
        double height = kb.nextInt();

        double dimension = length*width*height;

        //output
        if (weight > 27 & dimension > 100000) {
            System.out.println("Too heavy and too large");
        }
        else if (weight > 27) {
            System.out.println("Too heavy");
        }
        else if (dimension > 100000) {
            System.out.println("Too large");
        }
        else {
            System.out.println("meet the requirement");
        }

    }
}
