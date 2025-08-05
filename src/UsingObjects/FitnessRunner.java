package UsingObjects;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class FitnessRunner {

    private static int totalDays;

    public static void main(String[] args, Fitness user1, int day, int tries) {
        Scanner input = new Scanner(System.in);

        if (tries == 0) {
            System.out.print("Enter total days: ");
            totalDays = input.nextInt();
        }

        System.out.print("Enter no of steps on day " + day + ": ");
        int day2 = input.nextInt();
        user1.addDay(day2);

        if (totalDays == 1) {
            System.out.print("Average number of steps: "+ user1.getStepsPerDay());
            System.out.println(" ");
            User.main(args);
        }
        else {
            day++;
            totalDays--;
            tries++;
            FitnessRunner.main(args, user1, day, tries);
        }


        /*
        System.out.println("Enter info for user 2: ");
        input.nextLine();
        System.out.print("Name: ");
        String name2 = input.nextLine();
        System.out.print("Weight: ");
        double weight2 = input.nextDouble();
        System.out.print("Height: ");
        double height2 = input.nextDouble();
        System.out.print("Initial No. of Days: ");
        int initialDays = input.nextInt();
        System.out.print("Initial No. of Steps: ");
        int initialSteps = input.nextInt();

        Fitness user2 = new Fitness(name2,height2,weight2,initialDays,initialSteps);
        System.out.println(user2);
        user2.calculateBMI();
        System.out.println();
        System.out.println("Average number of steps: "+ user2.getStepsPerDay());
        System.out.println();

         */
    }
}
