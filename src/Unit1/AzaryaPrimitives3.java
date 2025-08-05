package Unit1;/*
Author: Azarya Silaen
 */

public class AzaryaPrimitives3 {
    public static void main(String[] args) {
        int items = 10;
        double price = 12.3;
        double discount = 0.02;
        double totalprice = (items*price*(1-discount));

        System.out.println("number of items: " + items);
        System.out.println("price per item: " + price);
        System.out.println("discount: " + (int)(discount*100) + "%");
        System.out.print("total price: " + String.format("%.2f", totalprice));
        //System.out.printf("%.2f", totalprice);

    }
}
