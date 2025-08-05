package Unit3;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class U3_1 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int num = 1; //step 1: create and initialize a control variable
        /*
        while (num >= 0) { //step 2: write a condition with the control variable
            System.out.println(num);
            num--; //step 3: change the control variable
        }

         */

        //while loop to print all even numbers from 1-10
        /*
        while (num <= 10) {
            if (num%2 == 0) System.out.println(num);
            num++;
         */

        /*
        boolean go = true;
        int i = 10;
        while (go) {
            if (i % 2 == 0) {
                System.out.println(Math.pow(i, 2));
                go = true;
                return;
            }
            if (i == 0) {
                go = false;
            }
            i--;
        }

         */

        /*
        String word = "Hello";
        int le = word.length();

        while (word.length() != 0) {
            word = word.substring(0, le);
            System.out.println(word);
            le--;
        }
         */

        //Enter minimum: 20
        //Enter maximum: 30
        //Odd Numbers from min to max
        //21
        //23
        //25
        //27
        //29
    }
}

