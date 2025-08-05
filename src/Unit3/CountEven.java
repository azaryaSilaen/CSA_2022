package Unit3;/*
Author: Azarya Silaen
 */

public class CountEven {
    public static void main(String[] args) {
        System.out.println(countEven(2, 10));
    }
    public static int countEven (int min, int max) {
        int counter = 0;
        for (int i = min; i < max; i++) {
            if (i%2 == 0) counter++;
        }
        return counter;
    }
}
