package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class Nickname {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Name: Joseph
        //Nickname: sephjo
        //Name: Maria
        //Nickname: riama

        System.out.print("Name: ");
        String name = input.nextLine();
        String nickname = name.substring(2);
        String nickname2 = name.substring(0, 2).toLowerCase();

        System.out.print("Nickname: " + nickname + nickname2);

    }
}
