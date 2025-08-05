package Unit2;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class U2_6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //0 up to but not including 4 dozen	$0.50 per dozen
        //4 up to but not including 6 dozen	$0.45 per dozen
        //6 up to but not including 11 dozen	$0.40 per dozen
        //11 or more dozen				$0.35 per dozen
        //Extra eggs are priced at 1/12 the per dozen price

        System.out.print("Enter the number of eggs: ");
        int egg = kb.nextInt();
        System.out.print("The bill is equal to: $");

        int dozen = egg/12;

        if (dozen < 4) {
            double price = 0.5;
            System.out.print(String.format("%.2f",dozen*price + egg%12*price/12));
        }
        else if (dozen < 6) {
            double price = 0.45;
            System.out.print(String.format("%.2f",dozen*price + egg%12*price/12));
        }
        else if (dozen < 11) {
            double price = 0.4;
            System.out.print(String.format("%.2f",dozen*price + egg%12*price/12));
        }
        else {
            double price = 0.35;
            System.out.print(String.format("%.2f",dozen*price + egg%12*price/12));
        }

    }
}
