package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class Input4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //request input
        System.out.print("Age: ");
        int age = input.nextInt();
        System.out.print("Birthday: ");
        input.nextLine();
        String birthday = input.nextLine();

        System.out.println("You are " + age + " years old. On " + birthday + " you will be " + (age+1) +".");
    }
}
