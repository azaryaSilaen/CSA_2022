package Unit3;/*
Author: Azarya Silaen
 */

public class extractDigits {
    public static void main(String[] args) {
        extractDigits(334211451);
    }

    public static void extractDigits (int number) {

        while (number > 0) {
            int ones = number%10;
            number/=10;
            System.out.println(ones);
        }
        /*
        String output;
        int digit = 10;

        while (number/digit != 0) {
            String += number%digit + '\n';
            digit*=10;
        }
         */

    }
}
