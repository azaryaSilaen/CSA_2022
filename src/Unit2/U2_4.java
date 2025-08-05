package Unit2;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class U2_4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);


        //input
        System.out.println("What do you want to drink?");
        String drink = kb.nextLine();
        System.out.println("How many teaspoons of sugar do you want?");
        int sugar = kb.nextInt();

        //output
        System.out.println("Confirming your order. You wanted:");
        System.out.print(drink);

        if (sugar > 0) {
            System.out.println(" with sugar");
        }
        /* hard way
        if (sugar == 0) {
            System.out.println(drink);
        }
        else {
            System.out.println(drink + " with sugar");
         */
        }
    }
