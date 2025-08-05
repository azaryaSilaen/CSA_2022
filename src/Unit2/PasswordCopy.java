package Unit2;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class PasswordCopy {

    //define as global object to keep all main process data
    public static int numTries;
    public static int maxTries = 5; //define total number of max tries
    public static String password;
    public static int usernameNum;
    public static String username;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        if (usernameNum > 0 && numTries == 0) {
            System.out.print("Username: ");
            String name = kb.nextLine();
            if (!name.equalsIgnoreCase(username)) {
                System.out.println("invalid Username, please try again");
                PasswordCopy.main(args);
            }
        }

        //input
        if (numTries == 0 && usernameNum == 0) {
            System.out.println("you have to have an account to continue using our service");
            System.out.println(" ");
            System.out.println("if you're a new user, Type \"1\" or \"SIGN UP\" to sign up");
            System.out.println("if you're an old user, Type \"0\" or \"LOG IN\" to log in");
            String account = kb.nextLine();
            if (account.equals("1") | account.equals("SIGN UP")) {
                System.out.println("\nWe love to welcome new user!");
                System.out.println(" ");
                System.out.println("NOTE: you can always change these information in settings");
                System.out.print("\nUsername: ");
                username = kb.nextLine();
                System.out.print("Password: ");
                password = kb.nextLine();

                System.out.println("\nYour account has been successfully created!");
                System.out.println("Please put the username and password that you have created below");
                System.out.print("\nUsername: ");
                String name = kb.nextLine();
                if (!name.equalsIgnoreCase(username)) {
                    System.out.println("invalid Username, please try again");
                    usernameNum++;
                    PasswordCopy.main(args);
                }
            }
            else if (account.equals("2") | account.equals("LOG IN")) {

                //old user information
                String username = "Azarya";
                password = "123";

                System.out.println("\nWelcome back users!");
                System.out.println("Please put your username and password below");
                System.out.print("\nUsername: ");
                String name = kb.nextLine();
                if (!name.equalsIgnoreCase(username)) {
                    System.out.println("invalid Username, please try again");
                    usernameNum++;
                    PasswordCopy.main(args);
                }
            }
            else {
                System.out.println("ERROR 400: Invalid command");
                System.out.println("Please check if the command is correct and try again");
                return;
            }

        }

        System.out.print("Password: ");
        String passInput = kb.nextLine();

        if (passInput.equals(password)) {
            HelloWorldApplication.main(args, username);

        } else {
            if ((maxTries-1) == 0) {
                    System.out.println("Wrong password, you can try again in 10 minutes");
                    return;
            } else {
                System.out.println("Wrong password, you have " + (maxTries-1) + " tries left");
                maxTries--;
                numTries++;
                PasswordCopy.main(args);
            }
        }
    }
}

