package Arrays;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class PlayingWithArrays {
    public static void main(String[] args) {

        int total = 0;

        Scanner kb = new Scanner(System.in);
        String [] students = {"Azarya", "Tim", "Janani", "Bianca", "Aryan"};
        String [] names = new String [5];
        int[] nums = {15, 21, 9, 20, 10, 30};

        double gpas[] = new double[5];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == 0 & nums[i] % 5 == 0) {
            }
            else if (nums[i] % 3 == 0 | nums[i] % 5 == 0) {
                System.out.println(nums[i]);
            }
        }


        for (int i = 0; i < nums.length; i++) {
           total += nums[i];
        }
        System.out.println(total);

        for (int i = 0; i < gpas.length; i++) {
            System.out.println("enter GPA for " + students[i]);
            gpas [i] = kb.nextDouble();
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println("Name: " + students[i] + ", GPA: " + gpas[i]);
        }
        System.out.println();
        System.out.println("Number of Students: " + students.length);
    }
}
