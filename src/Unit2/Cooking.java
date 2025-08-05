package Unit2;/*
Author: Azarya Silaen
 */

public class Cooking {
    public static void main(String[] args) {
        int microwave = (int)(Math.random()*150 + 90);
        System.out.println("Microwaving for " + microwave + " seconds");

        if (microwave <= 120) {
            System.out.println("Rolls will be the right temperature!");
        }
        else {
            System.out.println("Rolls will be boiling hot!");
        }
        
    }
}
