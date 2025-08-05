package Unit2;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class Discounts {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double cost = 4.25;

        //input
        System.out.println("How many hours were you parked?");
        double hours = kb.nextInt();

        System.out.print("You owe $");
        //if statements
        if (hours*cost <= 7) {
            System.out.print(7.0);
        }
        else if (hours < 3){
            System.out.print(hours*cost);
        }
        else {
            System.out.print((hours*cost)*0.75);
        }
    }
}
