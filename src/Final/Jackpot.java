package Final;/*
Author: Azarya Silaen
 */

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Jackpot {

  public static double bet;
  public static int rules1;
  public static int rules2;

  public static void main(String[] args) throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {


    double originalBet;

    Scanner kb = new Scanner(System.in);

    // choice of games
    System.out.println();
    System.out.println("Choice of games:");
    System.out.println("  3 random numbers (1)");
    System.out.println("  5 random numbers (2)");
    System.out.println("Please choose which game you want to play (0 to go back to home screen)");
    int choice = kb.nextInt();

    //3 random numbers
    if (choice == 1 || choice == 3) {
      // rules
        System.out.println("Rules (please read carefully)");
        System.out.println("The combination of 2 numbers being the same would give back 90% of the player’s bet.");
        System.out.println("The combination of 3 numbers being the same would give 5x of the player’s bet.");
        System.out.println("The combination of 2 numbers being the same (including same position) as the winning number");
        System.out.println("would give 2x of the player’s bet.");
        System.out.println("The combination of all 3 numbers being the same as the jackpot winning number (including the");
        System.out.println("same position) would give 20x of the player’s bet.");

      if (rules1 == 0) {
        Thread.sleep(5000);
        rules1 = 1;
        }
      else {
        Thread.sleep(1200);
      }

      do {
        do {
          //input bet
      System.out.print("Input bet: $");
      bet = kb.nextInt();
      originalBet = bet;

      //not enough chips
      if (bet > Casino.chips) {
        Casino.error();
        System.out.println("Total chips you have is only $" + Casino.chips);
      }
      } while (bet > Casino.chips);

      do {
        //taking out money
        bet = originalBet;
      Casino.profit -= originalBet;
        Casino.chips -= originalBet;
      System.out.println();
      Casino.gamesPlayed++;

      //lucky combination
      int luckRoll1 = Casino.randomizer(1,9);
      int luckRoll2 = Casino.randomizer(1,9);
      int luckRoll3 = Casino.randomizer(1,9);
      System.out.println("Lucky combination: ");
      Thread.sleep(1000);
      System.out.print(luckRoll1 + " ");
      Thread.sleep(1000);
      System.out.print(luckRoll2 + " ");
      Thread.sleep(1000);
      System.out.print(luckRoll3 + " ");
      System.out.println();

      //player's combination
      int roll1 = Casino.randomizer(1,9);
      int roll2 = Casino.randomizer(1,9);
      int roll3 = Casino.randomizer(1,9);

      System.out.println("Your roll: ");
      Thread.sleep(2000);
      System.out.print(roll1 + " ");
      Thread.sleep(2000);
      System.out.print(roll2 + " ");
      Thread.sleep(2000);
      System.out.print(roll3 + " ");
      System.out.println();

      //checking and giving out winning
      Checking3(luckRoll1,luckRoll2,luckRoll3,roll1,roll2,roll3);
        Casino.chips += bet;
      Casino.profit += bet;

      //losing all cheeps
      if (Casino.chips == 0) {
            System.out.println("You have lost all your chip");
            System.out.println("Do you want to top up or end the game? (1 to top up and 0 to end)");
            choice = kb.nextInt();

            //top up
            if (choice == 1) {
              System.out.println("Input amount to top up");
              double topUp = kb.nextDouble();
              Casino.chips += topUp;
            }
            //end
            else if (choice == 0) {
              Casino.ending(args);
              return;
            }
            else {
              Casino.error();
              return;
            }
      }
      //rolling again
        if (originalBet > Casino.chips) {
          System.out.println("Roll again?");
          System.out.println("(2 to change betting amount and 0 to go back to front screen)");
          choice = kb.nextInt();

          if (choice == 1) {
            choice = 3;
          }
          } else {
            System.out.println("Roll again?");
            System.out.println( "(1 to pay $" + originalBet + " again, 2 to change betting amount, 0 to go back to front screen)");
            choice = kb.nextInt();
      }

        //going back to front screen
      if (choice == 0) {
        Jackpot.main(args);
      }
      else if (choice != 1 & choice != 2) {
        Casino.error();
        break;
      }
      } while (choice == 1);
      } while (choice == 2);
    }

    //5 random numbers
    else if (choice == 2 || choice == 5) {
      // rules
        System.out.println("Rules (please read carefully)");
        System.out.println("The combination of 4 numbers being the same would give 5x of the player’s bet.");
        System.out.println("The combination of all 5 numbers being the same would give 15x of the player’s bet.");
        System.out.println("The combination of 4 numbers being the same (including same position) as the winning number");
        System.out.println("would give 10x of the player’s bet.");
        System.out.println("The combination of 5 numbers being the same (including same position) as the winning number");
        System.out.println("would give 50x of the player’s bet.");

        if (rules2 == 0) {
        Thread.sleep(5000);
          rules2 = 1;
      }
      else {
        Thread.sleep(1200);
      }


      do {
        do {
          //input bet
          System.out.print("Input bet: $");
          bet = kb.nextInt();
          originalBet = bet;

          //not enough chip
          if (bet > Casino.chips) {
            Casino.error();
            System.out.println("Total chips you have is only $" + Casino.chips);
          }
        } while (bet > Casino.chips);

        do {
          //taking out money
          bet = originalBet;
          Casino.profit -= originalBet;
          Casino.chips -= originalBet;
          Casino.gamesPlayed++;
          System.out.println();

          //lucky combination
          int luckRoll1 = Casino.randomizer(1,9);
          int luckRoll2 = Casino.randomizer(1,9);
          int luckRoll3 = Casino.randomizer(1,9);
          int luckRoll4 = Casino.randomizer(1,9);
          int luckRoll5 = Casino.randomizer(1,9);
          System.out.println("Lucky combination: ");
          Thread.sleep(500);
          System.out.print(luckRoll1 + " ");
          Thread.sleep(500);
          System.out.print(luckRoll2 + " ");
          Thread.sleep(500);
          System.out.print(luckRoll3 + " ");
          Thread.sleep(500);
          System.out.print(luckRoll4 + " ");
          Thread.sleep(500);
          System.out.print(luckRoll5 + " ");
          System.out.println();

          //player's combination
          int roll1 = Casino.randomizer(1,9);
          int roll2 = Casino.randomizer(1,9);
          int roll3 = Casino.randomizer(1,9);
          int roll4 = Casino.randomizer(1,9);
          int roll5 = Casino.randomizer(1,9);

          System.out.println("Your roll: ");
          Thread.sleep(1000);
          System.out.print(roll1 + " ");
          Thread.sleep(1000);
          System.out.print(roll2 + " ");
          Thread.sleep(1000);
          System.out.print(roll3 + " ");
          Thread.sleep(1000);
          System.out.print(roll4 + " ");
          Thread.sleep(1000);
          System.out.print(roll5 + " ");
          System.out.println();
          //checking
          Checking5(luckRoll1, luckRoll2, luckRoll3, luckRoll4, luckRoll5, roll1, roll2, roll3, roll4, roll5);
          //giving out winning
          Casino.chips += bet;
          Casino.profit += bet;

          //losing all chips
          if (Casino.chips == 0) {
            System.out.println("You have lost all your chip");
            System.out.println("Do you want to top up or end the game? (1 to top up and 0 to end)");
            choice = kb.nextInt();

            //top up
            if (choice == 1) {
              System.out.println("Input amount to top up");
              double topUp = kb.nextDouble();
              Casino.chips += topUp;
            }
            //end the game
            else if (choice == 0) {
              Casino.ending(args);
              return;
            }
            else {
              Casino.error();
              return;
            }
          }

          //asking to roll again

          //not enough chips for the original bet
          if (originalBet > Casino.chips) {
            System.out.println("Roll again?");
            System.out.println("(2 to change betting amount and 0 to go back to front screen)");
            choice = kb.nextInt();

            //making sure 1 becomes an error
            if (choice == 1) {
              choice = 3;
            }
          } else {
            System.out.println("Roll again?");
            System.out.println( "(1 to pay $" + originalBet + " again, 2 to change betting amount, 0 to go back to front screen)");
            choice = kb.nextInt();
          }

          //going back to front screen
          if (choice == 0) {
            Jackpot.main(args);
          }
          else if (choice != 1 & choice != 2) {
            Casino.error();
            break;
          }
        } while (choice == 1);
      } while (choice == 2);

    }

    //go back to home screen
    else if (choice == 0) {
      Casino.menu(args);
    }
    else {
      Casino.error();
      return;
    }
  }

  //checking method
  public static void Checking3 (int luck1, int luck2, int luck3, int roll1, int roll2, int roll3 ) throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {
    if (luck1 == roll1 & luck2 == roll2 & luck3 == roll3) {
      bet *= 20;
      System.out.println("Jackpot (you got the lucky combination)!! You won $" + bet);
      Audio.playSound(new File("win"));
    }
    else if ((luck1 == roll1 & luck2 == roll2) || (luck1 == roll1 & luck3 == roll3) || (luck3 == roll3 & luck2 == roll2)) {
      bet *= 2;
      System.out.println("2 numbers being the same (including same position) as the winning number!! You won $" + bet);
      Audio.playSound(new File("win"));
    }
    else if (roll1 == roll2 & roll1 == roll3) {
      bet *= 5;
      System.out.println("All 3 numbers are the same!! You won $" + bet);
      Audio.playSound(new File("win"));
    }
    else if (roll1 == roll2 || roll1 == roll3 || roll2 == roll3) {
      bet *= 0.9;
      System.out.println("2 numbers are the same!! You won $" + bet);
      Audio.playSound(new File("win"));
    }
    else {
      bet = 0;
      System.out.println("No winning combination, better luck next time");
      Audio.playSound(new File("over"));
    }
  }
  public static void Checking5 (int luck1, int luck2, int luck3, int luck4, int luck5,
                                int roll1, int roll2, int roll3, int roll4, int roll5) throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {
    if (luck1 == roll1 & luck2 == roll2 & luck3 == roll3 & luck4 == roll4 & luck5 == roll5) {
      bet *= 50;
      System.out.println("JACKPOT! you got the winning combination! You won $" + bet);
      Audio.playSound(new File("win"));
    }
    else if ((luck1 == roll1 & luck2 == roll2 & luck3 == roll3 & luck4 == roll4)
            || (luck1 == roll1 & luck2 == roll2 & luck3 == roll3 & luck5 == roll5)
            || (luck1 == roll1 & luck2 == roll2 & luck4 == roll4 & luck5 == roll5)
            || (luck1 == roll1 & luck3 == roll3 & luck4 == roll4 & luck5 == roll5)
            || (luck2 == roll2 & luck3 == roll3 & luck4 == roll4 & luck5 == roll5)) {
      bet *= 10;
      System.out.println("4 numbers being the same (including same position) as the winning number!! You won $" + bet);
      Audio.playSound(new File("win"));
    }
    else if (roll1 == roll2 & roll1 == roll3 & roll1 == roll4 & roll1 == roll5 ) {
      bet *= 15;
      System.out.println("All 5 numbers are the same!! You won $" + bet);
      Audio.playSound(new File("win"));
    }
    else if ((roll1 == roll2 & roll1 == roll3 & roll1 == roll4) //missing roll5
            || (roll2 == roll3 & roll2 == roll4 & roll2 == roll5) //missing roll1
            || (roll3 == roll4 & roll3 == roll5 & roll3 == roll1) //missing roll2
            || (roll4 == roll5 & roll4 == roll1 & roll1 == roll2) //missing roll3
            || (roll5 == roll1 & roll5 == roll2 & roll5 == roll3)) //missing roll4
    {
      bet *= 5;
      System.out.println("4 numbers are the same!! YOu won $" + bet);
      Audio.playSound(new File("win"));

    }
    else {
      bet = 0;
      System.out.println("No winning combination, better luck next time");
      Audio.playSound(new File("over"));
    }
  }

}
