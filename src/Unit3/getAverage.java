package Unit3;/*
Author: Azarya Silaen
 */

import Unit2.RandomNum;

public class getAverage {
    public static void main(String[] args) {

average(1, 30, 20);
    }

    public static void average (int min, int max, int n) {
        int total = 0;
        String list = "";

        for (int i = 0; i < n; i++) {
            int num = RandomNum.Int(min, max);
            total += num;
            list = list + num + " ";
        }
        double result = (double)total/n;
        System.out.println(list);
        System.out.println(result);

    }
}
