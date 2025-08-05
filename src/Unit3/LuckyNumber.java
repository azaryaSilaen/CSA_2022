package Unit3;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int lucky = 0;
        int counter = 0;

        int num;
        do {
            System.out.print("Enter a number : ");
            num = kb.nextInt();
            if (num >= 0) {
                if (!(num % 3 == 0 & num % 5 == 0) & (num % 3 == 0 | num % 5 == 0)) {
                    System.out.println(num + " is a lucky number");
                    lucky++;
                } else {
                    System.out.println(num + " is NOT a lucky number");
                }
                counter++;
            }
        }
        while (num >= 0);
        double percentage = ((double)lucky/counter)*100;
        System.out.println("Thank you…");
        System.out.println("Hey, you got lucky " + percentage + "% of the time!");
    }
}
