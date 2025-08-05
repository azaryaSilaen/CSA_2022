package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Name: ");
        String name = kb.nextLine();
        System.out.print("Age: ");
        int age = kb.nextInt();
        kb.nextLine();
        System.out.print("Last name: ");
        String lName = kb.nextLine();

        //output
        System.out.println("Welcome " + name + " " + lName + "!" + " You are " + age + " years old.");


    }
}
