package Final;/*
Author: Azarya Silaen
 */

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HigherLower {

    static int bet;
    static int maxCard;
    static int[] card = new int[52];
    static int randomNum;
    static int num;
    static int tries;
    static double multiplier;
    static double originalMultiplier;
    static int rules1;
    static int rules2;

  public static void main(String[] args) throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {
      int a = 0;
    Scanner kb = new Scanner(System.in);

    // choice of games
    System.out.println();
    System.out.println("Choice of games:");
    System.out.println("Card game (1)");
    System.out.println("Number game (2)");
    System.out.println("Please choose which game you want to play (0 to go back to home screen)");
    int choice = kb.nextInt();

   // card game
    if (choice == 1) {

        //rules
      System.out.println("Rules");
      System.out.println("A card will be dealt and your job is to make a prediction whether the next card");
      System.out.println("will be HIGHER or LOWER");
        if (rules1 == 0) {
            Thread.sleep(5000);
            rules1 = 1;
        }
        else {
            Thread.sleep(1200);
        }

        do {
        // difficulty
        System.out.println();
      System.out.println("Level of difficulty:");
      System.out.println(" Beginner (10 cards, odds 1 : 2) (1)");
      System.out.println("  Amateur (25 cards, odds 1 : 6) (2)");
      System.out.println("      Pro (all 52 cards,odds  1 : 15) (3)");
      System.out.println("Please choose which level of difficulty you want to play");
      choice = kb.nextInt();

      if (choice == 1) {
        maxCard = 10;
        multiplier = 2;
      } else if (choice == 2) {
        maxCard = 25;
        multiplier = 6;
      } else if (choice == 3) {
        maxCard = 52;
        multiplier = 15;
      } else {
        Casino.error();
        return;
      }
      originalMultiplier = multiplier;

      //bet
            do {
            do {
                System.out.print("Input bet: $");
                bet = kb.nextInt();
                if (bet > Casino.chips) {
                    Casino.error();
                    System.out.println("Total chips you have is only $" + Casino.chips);
                }
            } while (bet > Casino.chips);

            do {
                //take out moeny
      multiplier = originalMultiplier;
                Casino.chips -= bet;
      Casino.profit -= bet;
      Casino.gamesPlayed++;

      //deck of card
      for (int i = 1; i <= 13; i++) {
          for (int j = 0; j < 4; j++) {
              card [a] = i;
              a++;
                    }
                }
                a = 0;

      //first card
        int randomCard;
        randomCard = Casino.randomizer(0, 51);
        System.out.print("Dealer's card: ");

        if (card[randomCard] == 1) {
            System.out.println("Ace");
            System.out.println("Special card (both highest and lowest value card)");
        } else if (card[randomCard] == 11) {
            System.out.println("Jack");
        } else if (card[randomCard] == 12) {
            System.out.println("Queen");
        } else if (card[randomCard] == 13) {
            System.out.println("King");
        }
        else {
              System.out.println(card[randomCard]);
        }


      //playing
      for (int i = 0; i < maxCard; i++) {

          //user higher or lower
          System.out.println("Higher (1) or lower (2) ?");
          choice = kb.nextInt();

          if (choice == 1) {
              num = card[randomCard];
          } else if (choice == 2) {
              num = card[randomCard];
          } else {
              Casino.error();
              return;
          }

          //next card
          do {
              randomCard = Casino.randomizer(0, 51);
          } while (card[randomCard] == 0);
          System.out.print("Dealer's card: ");

          if (card[randomCard] == 1) {
              System.out.println("Ace");
              System.out.println("Special card (both highest and lowest value card)");
          } else if (card[randomCard] == 11) {
              System.out.println("Jack");
          } else if (card[randomCard] == 12) {
              System.out.println("Queen");
          } else if (card[randomCard] == 13) {
              System.out.println("King");
          }
          else {
          System.out.println(card[randomCard]);
          }

          //checking
          if (card[randomCard] == 1 || num == 1) {
              System.out.println("Correct because of special card!");
          }
          else if (card[randomCard] >= num & choice == 1) {
          System.out.println("Correct!");
          }
          else if (card[randomCard] <= num & choice == 2) {
          System.out.println("Correct!");
          }

          //losing
          else {
              System.out.println("Wrong prediction. Better luck next time!");
              Audio.playSound(new File("over"));
          multiplier = 0;
          break;
          }
      }

      //winning
      if (multiplier != 0) {
              System.out.println("Congratulations! You won " + (bet*multiplier));
          Audio.playSound(new File("win"));
      }

      //giving out winning
                Casino.chips += (bet*multiplier);
      Casino.profit += (bet*multiplier);

      //lost all chips
        if (Casino.chips == 0) {
            System.out.println("You have lost all your chip");
            Audio.playSound(new File("over"));
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
        //asking to play again
        if (bet > Casino.chips) {
            System.out.println("Play again?");
            System.out.println("(2 to change betting amount, 3 to change the difficulty, and 0 to go back to front screen)");
            choice = kb.nextInt();

            //making sure choice 1 in this game means 'error'
            if (choice == 1) {
                choice = 10;
            }
        } else {
            System.out.println("Play again?");
            System.out.println( "(1 to pay $" + bet + " again, 2 to change betting amount, 3 to change the difficulty, and 0 to go back to front screen)");
            choice = kb.nextInt();
        }
        } while (choice == 1);
            } while (choice == 2);
        } while (choice == 3);

        //go back to front screen
        if (choice == 0) {
            HigherLower.main(args);
        }
        else {
            Casino.error();
            return;
        }
    }

    //number game
    else if (choice == 2) {

        //rules
        System.out.println("Rules");
        System.out.println("A random lucky number will be given and your job is to guess that number");
      System.out.println("you will have a few tries(depending on the level of difficulty) and in each wrong answer");
        System.out.println("a clue will be given on whether the lucky number is HIGHER or LOWER than your chosen number");
        if (rules2 == 0) {
            Thread.sleep(5000);
            rules2 = 1;
        }
        else {
            Thread.sleep(1200);
        }

        //range of number
        do {
      System.out.println();
      System.out.println("range of number");
        System.out.println(" 1 - 20 (1)");
        System.out.println(" 1 - 100 (2)");
        System.out.println(" 1 - 500 (3)");
        System.out.println("Please choose which range of number you want to play");
        choice = kb.nextInt();
        int originalChoice = choice;

        do {
            //1-20
        if (originalChoice == 1) {

            //level of difficulty
            randomNum = Casino.randomizer(1, 20);
            System.out.println("Level of difficulty:");
            System.out.println(" Beginner (3 tries, odd 1:1.5) (1)");
            System.out.println(" Amateur (2 tries, odd 1:5) (2)");
            System.out.println(" Pro (1 tries, odd 1:12) (3)");
            System.out.println("Please choose which level of difficulty you want to play");
            choice = kb.nextInt();

            if (choice == 1) {
                tries = 3;
                multiplier = 1.5;
            }
            else if (choice == 2) {
                tries = 2;
                multiplier = 5;
            }
            else if (choice == 3) {
                tries = 1;
                multiplier = 12;
            }
            else {
                Casino.error();
                return;
            }

        }
        //1-100
        else if (originalChoice == 2) {

            //level of difficulty
            randomNum = Casino.randomizer(1, 100);
            System.out.println("Level of difficulty:");
            System.out.println(" Beginner (5 tries, odd 1:1.5) (1)");
            System.out.println(" Amateur (4 tries, odd 1:5) (2)");
            System.out.println(" Pro (3 tries, odd 1:12) (3)");
            System.out.println("Please choose which level of difficulty you want to play");
            choice = kb.nextInt();

            if (choice == 1) {
                tries = 5;
                multiplier = 1.5;
            }
            else if (choice == 2) {
                tries = 4;
                multiplier = 5;
            }
            else if (choice == 3) {
                tries = 3;
                multiplier = 12;
            }
            else {
                Casino.error();
                return;
            }
        }

        //1-500
        else if (originalChoice == 3) {

            //level of difficulty
            randomNum = Casino.randomizer(1, 500);
            System.out.println("Level of difficulty:");
            System.out.println(" Beginner (10 tries, odd 1:1.5) (1)");
            System.out.println(" Amateur (8 tries, odd 1:5) (2)");
            System.out.println(" Pro (6 tries, odd 1:12) (3)");
            System.out.println("Please choose which level of difficulty you want to play");
            choice = kb.nextInt();

            if (choice == 1) {
                tries = 10;
                multiplier = 1.5;
            }
            else if (choice == 2) {
                tries = 8;
                multiplier = 5;
            }
            else if (choice == 3) {
                tries = 6;
                multiplier = 12;
            }
            else {
                Casino.error();
                return;
            }
        }
        else {
            Casino.error();
            return;
        }

        do {
        do {
            //input bet
            System.out.print("Input bet: $");
            bet = kb.nextInt();
            if (bet > Casino.chips) {
                Casino.error();
                System.out.println("Total chips you have is only $" + Casino.chips);
            }
        } while (bet > Casino.chips);

        do {

            //take out money
        Casino.profit -= bet;
        Casino.chips -= bet;
        System.out.println();
        Casino.gamesPlayed++;

        //playing
        for (int i = tries; i > 0; i--) {
        System.out.println("You have " + i + " tries left");
        System.out.println("Choose a number");
        num = kb.nextInt();

        //winning
        if (num == randomNum) {
          System.out.println("Congratulations! You found the lucky number!");
          System.out.println("You won $" + (bet*multiplier));
            Audio.playSound(new File("win"));
            Casino.chips += (bet*multiplier);
          Casino.profit += (bet*multiplier);
          break;
        }
        //losing
        else if (i == 1) {
                System.out.println("The lucky number is " + randomNum);
                System.out.println("Better luck next time!");
            Audio.playSound(new File("over"));
                System.out.println();
        }
        //higher
        else if (num < randomNum) {
          System.out.println("The lucky number is HIGHER");
        }
        //lower
        else {
          System.out.println("The lucky number is LOWER");
        }
        }

        //making sure range of number stay the same
        if (originalChoice == 1) {
            randomNum = Casino.randomizer(1, 20);
        }
        else if (originalChoice == 2) {
            randomNum = Casino.randomizer(1, 100);
        }
        else if (originalChoice == 3) {
            randomNum = Casino.randomizer(1, 500);
        }

        //losing all chips
        if (Casino.chips == 0) {
            System.out.println("You have lost all your chip");
            Audio.playSound(new File("over"));
            System.out.println("Do you want to top up or end the game? (1 to top up and 0 to end)");
            choice = kb.nextInt();

            //top up
            if (choice == 1) {
                System.out.println("Input amount to top up");
                System.out.print("$");
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

        //asking to play again
        if (bet > Casino.chips) {
            System.out.println("Play again?");
            System.out.println("(2 to change betting amount, 3 to change the difficulty, 4 to change the range of number, and 0 to go back to front screen)");
            choice = kb.nextInt();

            if (choice == 1) {
                choice = 10;
            }
        } else {
            System.out.println("Play again?");
            System.out.println( "(1 to pay $" + bet + " again, 2 to change betting amount, 3 to change the difficulty, 4 to change the range of number, and 0 to go back to front screen)");
            choice = kb.nextInt();
        }
        } while (choice == 1);
    } while (choice == 2);
        } while (choice == 3);
        } while (choice == 4);

        //going back front screen
        if (choice == 0) {
            HigherLower.main(args);
        }
        else {
            Casino.error();
            return;
        }
        }

    //going back to home/menu screen
    else if (choice == 0) {
        Casino.menu(args);
    }
        }
}
