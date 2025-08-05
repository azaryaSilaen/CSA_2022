package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class PizzaCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //he cost of making a pizza at a local shop is as follows:
        //Labor cost is $0.75 per pizza, regardless of size
        //Rent cost is $1.00 per pizza, regardless of size
        //Materials is $0.05*diameter*diameter
        //Create a PizzaCost application that prompts the user for the size (diameter) of a pizza and then displays the cost of making the pizza.
        //Enter pizza diameter: 10
        //The pizza costs: 6.75

        final int rent = 1;
        final double labor = 0.75;
        final double material = 0.05;

        System.out.print("Enter amount of pizza: ");
        int pizza = input.nextInt();
        System.out.print("Enter pizza diameter: ");
        int diameter = input.nextInt();
        System.out.println("The pizza costs: " + "$" + (rent*pizza + labor*pizza + (pizza*material*diameter*diameter)));
    }
}
