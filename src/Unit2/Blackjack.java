package Unit2;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class Blackjack {

    static int tries;
    static int comTries;
    static int cardNum;
    static int cardNumCom;
    static int cardTotal;
    static int cardTotalPlayer;
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println(0%3);
        if (comTries == 0) {
            if (tries == 0) {
                System.out.println("1 - Play");
                System.out.println("0 - Quit");
                System.out.print("Enter your choice: ");
                int choice = kb.nextInt();

                if (choice != 1) {
                    System.out.println("C'mon man!");
                    return;
                }

                System.out.println("\nYour Cards");
                int cardP1 = dealingCardPlayer();
                int cardP2 = dealingCardPlayer();
                System.out.println("Card 1: " + cardP1);
                System.out.println("Card 2: " + cardP2);
                System.out.println("Total: " + cardNum);
            }

            if (cardNum == 21) {
                System.out.println("BLACKJACK! You Won!");
                return;
            }
            if (cardNum > 21) {
                System.out.println("more than 21, you lose!");
                return;
            }

            System.out.println("Another card? (1-Yes, 0-No)?");
            int card = kb.nextInt();

            if (card == 1) {
                int cardP3 = dealingCardPlayer();
                System.out.println("Card " + cardTotalPlayer + ": " + cardP3);
                System.out.println("Total: " + cardNum);
                tries++;
                Blackjack.main(args);
            }
            System.out.println("\nComputer Cards");
            int cardC1 = dealingCardComputer();
            int cardC2 = dealingCardComputer();
            System.out.println("Card 1: " + cardC1);
            System.out.println("Card 2: " + cardC2);
        }


        if (cardNumCom < cardNum || (cardNumCom == cardNum & cardNumCom <= 14)) {
            int cardC3 = dealingCardComputer();
            System.out.println("Card " + cardTotal + ": " + cardC3);
            comTries++;
            Blackjack.main(args);
        }

        System.out.println("Total: " + cardNumCom);

        if (cardNumCom == 21) {
            System.out.println("BLACKJACK! Computer WINS!");
            return;
        }
        else if (cardNumCom > 21) {
            System.out.println("more than 21, you WIN!");
            return;
        }
        else if (cardNumCom > cardNum) {
            System.out.println("Computer WINS!");
        }
        else if (cardNum > cardNumCom){
            System.out.println("You WIN!");
        }
        else {
            System.out.println("it's a draw!");
        }




    }

    public static int dealingCardPlayer() {
        int cardPlayer = RandomNum.Int(1,11);
        cardTotalPlayer++;
        cardNum = cardNum + cardPlayer;
        return cardPlayer;
    }
    public static int dealingCardComputer() {
        int cardCom = RandomNum.Int(1,11);
        cardTotal++;
        cardNumCom = cardNumCom + cardCom;
        return cardCom;
    }
}
