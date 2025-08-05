package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class MiddleTwo {
    public static void main(String[] args) {
        //creating a object "in" from class Scanner
        Scanner input = new Scanner(System.in);

        //Name: Lina
        //Middle two: in
        //Name: Peter
        //Middle two: et

        System.out.print("Name: ");
        String name = input.nextLine();
        String middleTwo = name.substring((name.length()/2)-1, (name.length()/2)+1);
        System.out.print("Middle two: " + middleTwo);
    }
}
