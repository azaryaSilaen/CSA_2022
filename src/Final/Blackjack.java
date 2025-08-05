package Final;/*
Author: Azarya Silaen
 */

import Unit2.RandomNum;

public class Blackjack {
  static int tries;
  static int comTries;
  static int cardNum;
  static int cardNumCom;
  static int cardTotal;
  static int cardTotalPlayer;

  public static void main(String[] args, double chips) {

    System.out.println("Welcome to blackjack");
    System.out.println();
    System.out.println();
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
