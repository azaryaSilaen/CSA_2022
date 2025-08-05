package Unit1;/*
Author: Azarya Silaen
 */
import java.util.Scanner;

public class AzaryaTimeApp {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int second;

        //don't change anything below!

        System.out.println("Welcome to Time App");
            //input
        System.out.print("Number of seconds: " );
        second = kb.nextInt();

        if (second > 1) {
            System.out.print(second + " seconds equals: ");
        }
        else {
            System.out.print(second + " second equals: ");
        }


        //unchangeable variables!
        final int hour = 60 * 60;
        final int minute = 60;
        final int totalHour = second / hour;
        final int totalMinute = (second - ((totalHour) * hour)) / minute;
        final int totalSecond = second - ((totalHour) * hour + (totalMinute * minute));

                //if formula

                    //displaying hour
        if (totalHour > 1) {
            if (totalMinute > 0) {
                System.out.print(totalHour + " hours");

            }
            else {
                System.out.print(totalHour + " hours ");

            }
        }
            else if (totalHour > 0) {
            if (totalMinute > 0) {
                System.out.print(totalHour + " hour");

            } else {
                System.out.print(totalHour + " hour ");
            }
        }

                    //displaying minute
        if (totalSecond > 0) {
            if (totalHour > 0) {
                if (totalMinute > 1) {
                    System.out.print(", " + totalMinute + " minutes ");
                } else if (totalMinute > 0) {
                    System.out.print(", " + totalMinute + " minute ");
                }

            } else {
                if (totalMinute > 1) {
                    System.out.print(totalMinute + " minutes ");
                } else if (totalMinute > 0) {
                    System.out.print(totalMinute + " minute ");
                }
            }
        } else {
            if (totalHour > 0) {
                if (totalMinute > 1) {
                    System.out.print(" and " + totalMinute + " minutes ");
                } else if (totalMinute > 0) {
                    System.out.print(" and " + totalMinute + " minute ");
                }
            } else {
                if (totalMinute > 1) {
                    System.out.print(totalMinute + " minutes ");
                } else if (totalMinute > 0) {
                    System.out.print(totalMinute + " minute ");
                }
            }
        }

                    //displaying second
        if (totalSecond > 1) {
            if (totalHour > 0) {
                System.out.print("and " + totalSecond + " seconds");
            }
            else {
                if (totalMinute > 0) {
                    System.out.print("and " + totalSecond + " seconds");
                }
                else {
                    System.out.print(totalSecond + " seconds");
                }
            }
        }
        else if (totalSecond > 0) {
            if (totalHour > 0) {
                System.out.print("and " + totalSecond + " second");
            }
            else {
                if (totalMinute > 0) {
                    System.out.print("and " + totalSecond + " second");
                }
                else {
                    System.out.print(totalSecond + " second");
                }
            }
        }
    }
}
