package Unit2;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class U2_5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //input
        System.out.println("This is a triangle application");
        System.out.print("Enter width: ");
        double width = kb.nextDouble();
        System.out.print("Enter height: ");
        double height = kb.nextDouble();

        //output

        //error
        if (width < 0 | height < 0) {
            System.out.println("Error 404: INVALID width or height");
            System.out.println("you may have put a negative number, please change it to positive");
        }

        //correct output
        else {
            System.out.println("Area: " + String.format("%.2f",(width*height)));
            if (width == height) {
                System.out.println("The rectangle is square.");
            }
        }
    }
}
