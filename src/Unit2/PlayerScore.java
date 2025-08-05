package Unit2;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class PlayerScore {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //input
        System.out.println("Enter player one's name:");
        String player1 = kb.nextLine();
        System.out.println("Enter player two's name:");
        String player2 = kb.nextLine();
        System.out.println("Enter " + player1 + "'s score");
        int score1 = kb.nextInt();
        System.out.println("Enter " + player2 + "'s score");
        int score2 = kb.nextInt();

        //comparing alphabetical
        int compare = player1.compareToIgnoreCase(player2);

        //output in order
        if (compare <= 0) {
            System.out.println(player1 + " scored " + score1 + " points");
            System.out.println(player2 + " scored " + score2 + " points");
        }
        else{
            System.out.println(player2 + " scored " + score2 + " points");
            System.out.println(player1 + " scored " + score1 + " points");
        }

        //output winner
        if (score1 > score2) {
            System.out.println(player1 + " wins!");
        }
        else if (score1 < score2) {
            System.out.println(player2 + " wins!");
        }
        else {
            System.out.println("no one wins, it's a draw!");
        }

    }
}
