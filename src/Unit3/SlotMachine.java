package Unit3;/*
Author: Azarya Silaen
 */

import Unit2.RandomNum;

import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("How many spins to make?");
        int spin = kb.nextInt();

        int jackpot = 0;

        for (int i = spin; i > 0; i--) {
            int a = RandomNum.Int(1,5);
            int b = RandomNum.Int(1,5);
            int c = RandomNum.Int(1,5);

            System.out.println(a + " " + b + " " + c);

            if (a == b & b == c) {
                jackpot++;
            }
        }

        System.out.println("you made " + jackpot + " jackpots");

    }
}
