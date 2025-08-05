package Unit1;/*
Author: Azarya Silaen
 */

public class Primitives5 {
    public static void main(String[] args) {
        int numEggs = 2100;
        double price = 5.6;
        int numDozen = numEggs/12;
        double totalprice = numDozen*price;

        System.out.println("Number of eggs: " + numEggs);
        System.out.println("Price per dozen: " + price);
        System.out.println("Total number of dozen: " + numDozen);
        System.out.println("Total price: " + String.format("%.1f",totalprice));
    }
}
