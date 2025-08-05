package Unit3;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter grade (0 to quit): ");
        double grade = kb.nextDouble();
        double totalGrade = grade;
        int counts = 0;

        while (grade != 0) {
            System.out.print("Enter grade (0 to quit): ");
            grade = kb.nextDouble();
            totalGrade += grade;
            counts++;
        }

        System.out.println("Average is: " + totalGrade/counts);
    }
}
