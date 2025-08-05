package UsingObjects;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class User {

    private static int user = 1;
    private static int totalDays;
    private static int userTries;
    private static int maxUser;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        if (userTries == 0) {
            System.out.print("Enter total user: ");
            maxUser = input.nextInt();
        }

        System.out.println(" ");

        if (user == (maxUser+1)) {
            return;
        }

        System.out.println("Enter info for user " + user + ": ");
        System.out.print("Name: ");
        if (userTries == 0) {
            input.nextLine();
        }
        String name1 = input.nextLine();
        System.out.print("Weight: ");
        double weight1 = input.nextDouble();
        System.out.print("Height: ");
        double height1 = input.nextDouble();

        Fitness user1 = new Fitness(name1,height1,weight1);
        System.out.println(" ");
        System.out.println(user1);
        user1.calculateBMI();
        System.out.println();

        user++;
        userTries++;
        int day = 1;
        int tries = 0;
        FitnessRunner.main(args, user1, day, tries);
    }
}
