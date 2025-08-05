package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class NightOut {
    public static void main(String[] args) {
        Scanner budget = new Scanner(System.in);

        System.out.println("How much does dinner usually cost?");
        double dinner = budget.nextDouble();
        System.out.println("How much is laser tag for one person?");
        double tag = budget.nextDouble();
        System.out.println("How much does a triple scoop cost? ");
        double iceCream = budget.nextDouble();

        double sumDinner = (dinner + 2*dinner);
        double sumTag = (tag + tag);
        double sumIceCream = (iceCream + iceCream/3);

        System.out.println("\nDinner: $" + String.format( "%.2f", sumDinner));
        System.out.println("Laser Tag: $" + String.format( "%.2f",sumTag));
        System.out.println("Ice-cream: $" + String.format( "%.2f",sumIceCream));
        System.out.println("Grand Total: $" + String.format( "%.2f",(sumDinner+sumTag+sumIceCream)));

    }
}
