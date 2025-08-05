package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class PrimitiveTypesBlack {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //Sphere input
        System.out.println("Sphere");
        System.out.print("Enter radius: ");
        double radius = kb.nextDouble();

        //system
        double volume = 4*Math.PI*Math.pow(radius, 3)/3;

        //Sphere output
        System.out.println("Volume of sphere: " + String.format("%.2f",volume));


        //Trapezoid input
        System.out.println("\nTrapezoid");
        System.out.print("Enter base a: ");
        double baseA = kb.nextDouble();
        System.out.print("Enter base b: ");
        double baseB = kb.nextDouble();
        System.out.print("Enter height: ");
        double height = kb.nextDouble();

        //System
        double area = (baseA+baseB)/2*height;

        //Trapezoid output
        System.out.println("Area of trapezoid: " + area);
    }
}
