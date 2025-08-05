package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class Azarya_U1SA_Green {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Welcome to Area/Volume of Cylinder");

        //input information
        System.out.print("\nEnter radius: ");
        double radius = kb.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double height = kb.nextDouble();
        System.out.println();

        //output (formula)
        System.out.println("Area of Cylinder: " + String.format("%.2f", 2*Math.PI*radius*(radius+height)));
        System.out.println("Volume of Cylinder: " + String.format("%.2f",Math.PI*Math.pow(radius, 2)*height));
    }
}
