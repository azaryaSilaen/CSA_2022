package Unit3;/*
Author: Azarya Silaen
 */

public class U3_4 {
    public static void main(String[] args) {
        toThePower();
    }
    public static void toThePower() {
        for ( int i = 1; i <= 7; i++) {
            System.out.println(i + " = " + Math.pow(i, i));
        }
    }
}
