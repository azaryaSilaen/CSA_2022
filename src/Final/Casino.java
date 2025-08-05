package Final;/*
Author: Azarya Silaen
 */


import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Casino {

  public static double chips;
  public static double originalChips;
  public static double profit;
  public static int code;
  public static int gamesPlayed;
  public static int end;
  public static String name;
  public static int age;
  public static String gender;
  public static String occupation;

  static Scanner kb = new Scanner(System.in);

  public static void main(String[] args) throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {


    // introduction
      System.out.println("Welcome to the Casino!");
      System.out.println();

      // personal information
      System.out.println("Please fill out the following questions before continue");
      System.out.print("Full Name: ");
      name = kb.nextLine().trim();

      System.out.print("Age: ");
      age = kb.nextInt();
      if (age < 21) {
        System.out.println(
            "you have to be at least 21 years old to play in a casino according to law");
        return;
      }
      kb.nextLine();
      System.out.print("Gender (male, female, other): ");
      gender = kb.nextLine().toLowerCase();
      System.out.print("Occupation: ");
      occupation = kb.nextLine();

      if (!UsernameValid(name) || !UsernameValid(gender) || !UsernameValid(occupation)) {
          error();
          return;
      }

      String lastName = name.substring(name.lastIndexOf(" ") + 1);

      // greeting
      if (gender.equals("male")) {
        if (name.lastIndexOf(" ") < 0) {
          System.out.println("Welcome Mr. " + name);
        } else {
          System.out.println("Welcome Mr. " + lastName);
        }
      } else if (gender.equals("female")) {
        if (name.lastIndexOf(" ") < 0) {
          System.out.println("Welcome Ms. " + name);
        } else {
          System.out.println("Welcome Ms. " + lastName);
        }
      } else {
        System.out.println("Welcome!");
      }

      // chips
      System.out.print(
          "Please put amount of total chip you want to buy in dollars "
              + "\n(minimum of $100, you won’t need to spend all of it, taxes applied) : "
              + "\n$");
      chips = kb.nextDouble();
      originalChips = chips;
      kb.nextLine();

      if (chips < 100) {
        error();
        System.out.println("the total bet is lower than the minimum");
        return;
      }

      //verification code
      code = randomizer(100000, 999999);
      System.out.println("This is your secret verification code : " + code);
      System.out.println("This is the code that you're gonna use to play and redeem back your money so if possible write it down so you won’t forget");
      System.out.println("Don’t share it with anyone!");
      System.out.println();
      Thread.sleep(5000);

      // terms and conditions
      System.out.println("(read all before continue)");
      System.out.println("Terms & conditions");
      System.out.println("I’m well aware that there’s a significant chance my money would be");
      System.out.println("lost. his is in no way the dealer’s fault and as a result, I won’t in");
      System.out.println("any way put the fault at the dealer and the house for any loss that I");
      System.out.println("might have for any reasons.");
      System.out.println("The house has the right to kick anyone out and take away their");
      System.out.println("winnings for reasons that they felt appropriate.");
      System.out.println("For any players that has been found cheating or making unfair");
      System.out.println("advantage will result in a fine of $10000, permanent ban, and lost in");
      System.out.println("all their bet and winnings that they might have had, even if not all");
      System.out.println("of them were achieved illegitimately.");
      System.out.println("Past results don't guarantee future outcomes.");

      Thread.sleep(1000);
      System.out.println("Do you agree with the terms and conditions? (y/n)");
      String agreement = kb.nextLine().toLowerCase();

      //not agreeing
      if (!agreement.equals("y")) {
        System.out.println();
        System.out.println("Thank you for using our service");
        return;
      }

      System.out.println("Signature: ");
      String signature = kb.nextLine();

      if (!UsernameValid(signature)) {
          error();
          return;
      }

      menu(args);

}
    public static void menu(String[] args) throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {


    // home manu
    if (end == 0) {
      System.out.println();
      System.out.println("Choice of games:");
      System.out.println("  Jackpot (1)");
      System.out.println("  Higher/Lower (2)");
      System.out.println("Please choose which game you want to play (0 to end)");
      int choice = kb.nextInt();

      // jackpot
      if (choice == 1) {
        Jackpot.main(args);
      }

      // higher/lower
      else if (choice == 2) {
        HigherLower.main(args);
      }

      //end
      else if (choice == 0) {
        ending(args);
      }

      //error
      else {
        error();
        return;
      }

    }
    }

    public static void ending(String[] args) throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {


     //EndScreen
      int verificationCode;
      int a = 5;
      int maxTries = 3;
      double taxes = 0.24;

      //verification check
      do {
        System.out.print("verification code: ");
        verificationCode = kb.nextInt();

        //wrong code
        if (verificationCode != code) {
          maxTries--;

          //no more tries
          if (maxTries == 0) {
            System.out.println("No more tries, you won't be able to retrieve your winning amount if you forgot your verification code");
            System.out.println("Please contact us if you need any help");
            System.out.println("Instagram: @AzaryaKrishna");
            return;
          }
          System.out.println("invalid code");
          System.out.println(maxTries + " tries left");
          System.out.print("Try again in ");

          //timer
          for (int i = a; i >= 0; i--) {
            System.out.print(i);

              Thread.sleep(1000);

            if (i < 10) {
              System.out.print("\b");
            }
            else if (i < 100){
              System.out.print("\b\b");
            }
            else {
            System.out.print("\b\b\b");
            }
          }
          System.out.println();
          a *= 2;

        }
      }
      while (verificationCode != code);

      // personal information
      System.out.println();
      System.out.println("Personal Information");
      System.out.println("Full name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Gender: " + gender);
      System.out.println("Occupation: " + occupation);
      System.out.println();

      //betting information
      if (profit >= 0) {
        profit*=(1-taxes);
      }
      System.out.println("Original bet: $" + originalChips);

      if (profit < 0) {
          System.out.println("Profit (after taxes): -$" + profit*-1);
      }
      else {
          System.out.println("Profit (after taxes): $" + profit);
      }
      System.out.println("Total Winning: $" + (originalChips+profit));
      System.out.println("Games played: " + gamesPlayed);

        if (profit < 0) {
            System.out.println("Average winning per game: -$" + String.format("%.2f",(profit/gamesPlayed)*-1));
        }
        else {
            System.out.println("Average winning per game: $" + String.format("%.2f",profit/gamesPlayed));
        }
    System.out.println();

        //goodbye message
        Audio.playSound(new File("ending"));
        System.out.println("Thank you for playing with us!");
    System.out.println("We hope to see you soon! :)");
        System.out.println("Please contact us if you need any help");
        System.out.println("Instagram: @AzaryaKrishna");
    }

  public static boolean UsernameValid(String password)
  {
    // DEFINE valid char
    String checker = " abcdefghijklmnopqrstuvwxyz";

    // SET UP return object
    boolean[] resultValid = new boolean[password.length()];

    // CONVERT valid char to array
    String[] validChar = new String[checker.length()];
    for(int i = 0; i < checker.length(); i++)
    {
      validChar[i] = checker.substring(i, i+1);
    }

    // CONVERT password char to array
    String[] pwdChar = new String[password.length()];
    for(int i = 0; i < password.length(); i++)
    {
      pwdChar[i] = password.substring(i, i+1);
    }

    // CHECK validity of password char
    for (int i = 0; i < pwdChar.length; i++)
    {
      for (int j = 0; j < validChar.length; j++)
      {
        if (pwdChar[i].equalsIgnoreCase(validChar[j])) {
          resultValid[i] = true;
          break;
        } else {
          resultValid[i] = false;
        }
      }
      if (!resultValid[i]) return false;
    }

    return true;
  }

  public static int randomizer (int min, int max) {
    int random = (int) (Math.random() * (max - min + 1) + min);
    return random;
  }

  public static void error () {
    System.out.println(randomizer(100,999) + ". That's an error.");
    System.out.println("Wrong Input");
  }

}
