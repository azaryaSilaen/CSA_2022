package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class PrimitiveTypesBlue {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //name
        System.out.println("Soccer player statistics");
        System.out.print("Enter soccer player name: ");
        String name = kb.nextLine();
        System.out.print("Enter soccer player last name: ");
        String lName = kb.nextLine();

        //game 1
        System.out.print("\nEnter game 1 minutes played: ");
        int minutes1 = kb.nextInt();
        System.out.print("Enter game 1 goals scored: ");
        int goal1 = kb.nextInt();
        System.out.print("Enter game 1 faults: ");
        int faults1 = kb.nextInt();

        //game 2
        System.out.print("\nEnter game 2 minutes played: ");
        int minutes2 = kb.nextInt();
        System.out.print("Enter game 2 goals scored: ");
        int goal2 = kb.nextInt();
        System.out.print("Enter game 2 faults: ");
        int faults2 = kb.nextInt();

        //game 3
        System.out.print("\nEnter game 3 minutes played: ");
        int minutes3 = kb.nextInt();
        System.out.print("Enter game 3 goals scored: ");
        int goal3 = kb.nextInt();
        System.out.print("Enter game 3 faults: ");
        int faults3 = kb.nextInt();

        //player stats
        System.out.println("\nPlayer Stats");

        System.out.format("%-25s %-8s","Player Full Name", name + " " + lName);
        System.out.format("\n%-25s %-8s","Initials", name.substring(0,1).toUpperCase() + lName.substring(0,1).toUpperCase());
        System.out.format("\n%-25s %-8s","Average Minutes Played", (double)((minutes1+minutes2+minutes3)/3));
        System.out.format("\n%-25s %-8s","Goals", (goal1+goal2+goal3));
        System.out.format("\n%-25s %-8s","Faults", (faults1+faults2+faults3));
        System.out.format("\n%-25s %-8s","Ratio fault/goal", String.format("%.2f",(double)(faults1+faults2+faults3)/(goal1+goal2+goal3)));
    }
}
