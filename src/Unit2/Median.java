package Unit2;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input
        System.out.println("Enter the first integer:");
        int number1 = input.nextInt();
        System.out.println("Enter the second integer:");
        int number2 = input.nextInt();
        System.out.println("Enter the third integer:");
        int number3 = input.nextInt();

        //output
        if ((number1 >= number2 & number1 <= number3) || (number1 <= number2 & number1 >= number3)) {
            System.out.println("The median is " + number1);
        }
        else if ((number2 >= number1 & number2 <= number3) || (number2 <= number1 & number2 >= number3)) {
            System.out.println("The median is " + number2);
        }
        else {
            System.out.println("The median is " + number3);
        }
    }
}
