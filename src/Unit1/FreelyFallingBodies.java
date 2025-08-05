package Unit1;/*
Author: Azarya Silaen
 */

public class FreelyFallingBodies {
    public static void main(String[] args) {

        /* Question:
         * 1. You’re standing at the edge of a waterfall and drop a pebble.
         * It takes 23 seconds to hit the ground. How high up are you?
         * In other words, what’s the height of the waterfall?

         * 2. What is the velocity of the pebble when it hits the ground?
         */

        final double g = 9.8;
        int t = 23;

        //optional for first way
        double h = 0.5*g*t*t;
        double v = g*t;

        System.out.println();

        //first way
        System.out.println("First way");
        System.out.println("The height of the waterfall is " + h + " m");
        System.out.println("The velocity of the pebble when it hits the ground is " + v + " m/s");
        System.out.println("\n-----------------------------------------------------------");

        //second way
        System.out.println("second way");
        System.out.println("\nThe height of the waterfall is " + (0.5*g*t*t) + " m");
        System.out.println("The velocity of the pebble when it hits the ground is " + (g*t) + " m/s");



    }
}
