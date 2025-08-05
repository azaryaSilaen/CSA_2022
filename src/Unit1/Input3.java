package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class Input3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Name: ");
        String name = kb.nextLine();
        System.out.print("Age: ");
        int age = kb.nextInt();
        System.out.print("Adult: ");
        boolean adult = kb.nextBoolean();

        if (adult == true) {
            System.out.println("It's " + adult + " that " + name + " is an adult, " + "age " + age + " is an adult.");
        }

    else {
            System.out.println("It's " + adult + " that " + name + " is an adult, " + "age " + age + " is not an adult.");
        }
    }
}
