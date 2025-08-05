package Unit1;/*
Author: Azarya Silaen
 */
import java.util.Scanner;
import java.util.SortedSet;

public class AzaryaWeeklyCalendar {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        final int days = 7;
        final int weekdays = 5;
        final int maxHours = 24*days;
        double homework;
        double sleep;
        double school;
        double family;
        double friends;
        double leisure;

        System.out.println("Welcome to Weekly Calendar");
        System.out.println("");
        System.out.println("All the questions is for time spent in a day");
        System.out.print("\nEnter time spent for school: " );
        school = kb.nextDouble();
        System.out.print("Enter time spent for homework: ");
        homework = kb.nextDouble();
        System.out.print("Enter time spent for sleep: " );
        sleep = kb.nextDouble();
        System.out.print("Enter time spent for family: " );
        family = kb.nextDouble();
        System.out.print("Enter time spent for friends: " );
        friends = kb.nextDouble();
        System.out.print("Enter time spent for leisure: " );
        leisure = kb.nextDouble();
        System.out.println();

        final double totalHours = (homework+sleep+school+family+friends+leisure)*days;

        System.out.println("Weekly Time Distribution (168 hours)");
        System.out.format("%-15s %-15s %-15s", "Activities", "Hours", "Percentage");
        System.out.format("\n%-15s %-15s %-15s", "School", school*weekdays, (int)((school*days)/totalHours*100) +"%");
        System.out.format("\n%-15s %-15s %-15s", "Homework", homework*days, (int)((homework*days)/totalHours*100) +"%");
        System.out.format("\n%-15s %-15s %-15s", "Sleep", sleep*days, (int)((sleep*days)/totalHours*100) +"%");
        System.out.format("\n%-15s %-15s %-15s", "Family", family*days, (int)((family*days)/totalHours*100) +"%");
        System.out.format("\n%-15s %-15s %-15s", "Friends", friends*days, (int)((friends*days)/totalHours*100) +"%");
        System.out.format("\n%-15s %-15s %-15s", "Leisure", leisure*days, (int)((leisure*days)/totalHours*100) +"%");
        System.out.println();
        System.out.println("\nTotal hours accounted: " + (int)totalHours);
        System.out.println("Hours not accounted: " + (int)(maxHours-totalHours));


    }
}
