package Unit2;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class OldEnough {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //input
        System.out.print("Enter your age: ");
        int age = kb.nextInt();

        //simple techniques (output)
        //System.out.println(")ld enough to vote: " + (age >= 17));

        //IF techniques (output)
        if (age >= 17) {
            System.out.println("You're old enough to vote, go VOTE!");
        }
        else {
            System.out.println("You're NOT old enough to vote");
        }

    }
}
