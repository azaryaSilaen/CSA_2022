package Unit1;/*
Author: Azarya Silaen
 */

public class Prints {
    public static void main(String[] args) {
       int num = 1550;
       double price100 = 12.5;
       double price = 1.7;

       double sum100 = (num/100)*price100;

       //first way (the hard way)
       int leftSum = num-((num/100)*100);

       //second way (the easier way)
       leftSum = num%100;

       double sum = price*leftSum;

        System.out.println("Number of pages: " + num);
        System.out.println("Price per 100 pages: " + price100);
        System.out.println("Price per page: " + price);
        System.out.println("Total price of prints: " + (sum100+sum));








    }
}
