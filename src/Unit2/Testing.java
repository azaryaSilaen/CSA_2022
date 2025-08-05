package Unit2;/*
Author: Azarya Silaen
 */


public class Testing {
    public static void main(String[] args) {
        double weight = 120;
        double height = 1.7;

        double BMI = weight/Math.pow(height, 2);
        System.out.println(String.format("%.2f",BMI));

    }
}
