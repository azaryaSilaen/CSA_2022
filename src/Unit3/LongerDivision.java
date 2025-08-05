package Unit3;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class LongerDivision {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double count = 0;
        int block = 0;

        System.out.println("Put the first number (the one that you want to divide)");
        double num1 = kb.nextInt();
        System.out.println("Put the second number (the one that you want to divide first number by)");
        double num2 = kb.nextInt();

        while (block != 1) {

            if (num1 - num2 > 0) {
                num1 -= num2;
                count++;
            }
            else {
                double leftNum = num1/num2;
                count+= leftNum;
                block = 1;
            }
        }
        System.out.println(String.format("%.2f", count));
    }
}
