package Unit1;/*
Author: Azarya Silaen
 */

public class TestingForFun {
    public static void main(String[] args) {
        int investment = 5400;
        double interest = 1. / 100;
        int intPerTime = 1;
        int days = 365;
        days *= 5;
        double convert = 14337;
        double finalAmount = investment * Math.pow(1 + interest / intPerTime, intPerTime * days);

        System.out.println("Final amount: ");
        if (((int) finalAmount) > 1000000) {
            System.out.println("$" + (int) (finalAmount) / 1000000 + "," + (int)((int)(finalAmount) - ((int)((finalAmount) / 1000000))));
        }

        System.out.println("Rp" + (int) (finalAmount * convert));
    }
}
