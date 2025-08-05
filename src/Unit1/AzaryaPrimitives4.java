package Unit1;/*
Author: Azarya Silaen
 */

public class AzaryaPrimitives4 {
    public static void main(String[] args) {

        double math = 89.20;
        double physics = 67.30;
        double literature = 88.00;

        System.out.println();
        System.out.printf("Math Grade: "  + "%.1f" , math);
        System.out.printf("\nPhysics Grade: "  + "%.1f" , physics);
        System.out.printf("\nliterature Grade: " + "%.1f" , literature);
        System.out.printf("\nAverage: " + "%.1f", ((math + physics + literature)/3));
        //System.out.println("Average: " + String.format("%.2f", ((math+physics+literature)/3)));
    }
}
