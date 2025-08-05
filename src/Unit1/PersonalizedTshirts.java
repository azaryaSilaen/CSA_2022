package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class PersonalizedTshirts {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Welcome to Personalized T-shirt");
        System.out.print("\nPlease put the cost of the T-shirt: ");
        int cost = kb.nextInt();
        System.out.println("The t-shirt cost $" + cost +".");
        System.out.println("A personalized t-shirt costs $" + (++cost) +".");
        System.out.println("Without personalization, the t-shirt costs $" + (--cost) +".");
    }
}
