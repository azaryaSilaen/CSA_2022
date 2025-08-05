package Unit2;/*
Author: Azarya Silaen
 */

import Unit1.*;
import java.time.*;
import java.util.Scanner;

public class HelloWorldApplication {

    public static int addViewer;

    public static void main(String[] args, String username) {
        Scanner kb = new Scanner(System.in);

        LocalDateTime dateTime = LocalDateTime.now();
        LocalTime currentTime = dateTime.toLocalTime();

        //introduction
        System.out.println("\nWelcome to hello world!");
        System.out.println("We're happy to see you " + username);
        System.out.println("You're the " + (RandomNum.Int(10,100)+addViewer) + " viewer today!");
        System.out.println("Today's date is " + LocalDate.now() + " at " + currentTime);

        //App selection
        System.out.println("\nplease choose one of the application below");
        System.out.println("1. CSA Bank for Personal Account");
        System.out.println("2. Weekly Calendar");
        System.out.println("3. Time App or Conversion");
        System.out.println("4. MLA Citation");
        System.out.println("5. Personalized T-shirts");
        System.out.println("6. Pig Latin");
        System.out.println("7. Quote Machine");
        System.out.println("8. Letter Grade");

        //summative app selection
        System.out.println("\nyou might also choose one of the summative apps below");

        System.out.println("1S. Phrases");
        System.out.println("2S. Books Borrowed");
        System.out.println("3S. Area/Volume of Cylinder");

        //input/selecting
        System.out.println("\nwhich app you want to use?");
        System.out.println("NOTE: it's case sensitive");
        String selection = kb.nextLine();

        //going to the app that they selected
        if (selection.equals("1") | selection.equals("CSA Bank for Personal Account")
                | selection.equals("1. CSA Bank for Personal Account") | selection.equals("CSA Bank") ) {
            System.out.println(" ");
            AzaryaPersonalAccount.main(args);
        }
        else if (selection.equals("2") | selection.equals("Weekly Calendar")
                | selection.equals("2. Weekly Calendar") ) {
            System.out.println(" ");
            AzaryaWeeklyCalendar.main(args);
        }
        else if (selection.equals("3") | selection.equals("Time App or Conversion")
                | selection.equals("3. Time App or Conversion") ) {

            System.out.println("\nDo you want to go to Time App or time Conversion?");
            System.out.println("Type \"1\" or \"Time App\" to go to Time App");
            System.out.println("Type \"2\" or \"Time Conversion\" to go to Time Conversion");
            String appvsConversion = kb.nextLine();

            if (appvsConversion.equals("1") | appvsConversion.equals("Time App")) {
                AzaryaTimeApp.main(args);
                System.out.println("Is this the correct app?");
                System.out.println("Type \"1\" or \"Time Conversion\" to go to Time Conversion");
                System.out.println("Type \"0\" or \"YES\" if it's the correct application");
                String correctApp1 = kb.nextLine();
                if (correctApp1.equals("1") | correctApp1.equals("Time Conversation")) {
                    System.out.println(" ");
                    TimeConversion.main(args);
                }
            }
            else if (appvsConversion.equals("2") | appvsConversion.equals("Time Conversion")) {
                TimeConversion.main(args);
                System.out.println("");
                System.out.println("\nIs this the correct app?");
                System.out.println("Type \"1\" or \"Time App\" to go to Time App");
                System.out.println("Type \"0\" or \"YES\" if it's the correct application");
                String correctApp1 = kb.nextLine();
                if (correctApp1.equals("1") | correctApp1.equals("Time App")) {
                    System.out.println(" ");
                    AzaryaTimeApp.main(args);
                }
            }
            else {
                System.out.println("ERROR 402: please put the correct selection");
                System.out.println("Remember, it's case sensitive");
            }

        }
        else if (selection.equals("4") | selection.equals("MLA Citation")
                | selection.equals("4. MLA Citation") ) {
            System.out.println(" ");
            MLACitation.main(args);
        }
        else if (selection.equals("5") | selection.equals("Personalized T-shirts")
                | selection.equals("5. Personalized T-shirts") ) {
            System.out.println(" ");
            PersonalizedTshirts.main(args);
        }
        else if (selection.equals("6") | selection.equals("Pig Latin")
                | selection.equals("6. Pig Latin") ) {
            System.out.println(" ");
            pigLatin.main(args);
        }
        else if (selection.equals("7") | selection.equals("Quote Machine")
                | selection.equals("7. Quote Machine") ) {
            System.out.println(" ");
            QuoteMachine.main(args);
        }
        else if (selection.equals("8") | selection.equals("Letter Grade")
                | selection.equals("8. Letter Grade") ) {
            System.out.println(" ");
            U2_7.main(args);
        }

        else if (selection.equals("1S") | selection.equals("Phrases")
                | selection.equals("1S. Phrases") ) {
            System.out.println(" ");
            System.out.println("Do you want two-word or three-word phrase?");
            System.out.println("Type \"1\" or \"two-word\" to go to two-word phrase");
            System.out.println("Type \"2\" or \"three-word\" to go to three-word phrase");
            String twoVsThree = kb.nextLine();

            if (twoVsThree.equals("1") | twoVsThree.equals("two-word")) {
                System.out.println(" ");
                TwoWordPhrase.main(args);
                System.out.println(" ");
                System.out.println("\nIs this the correct app?");
                System.out.println("Type \"1\" or \"three-word\" to go to three-word");
                System.out.println("Type \"0\" or \"YES\" if it's the correct application");
                String correctApp1 = kb.nextLine();
                if (correctApp1.equals("1") | correctApp1.equals("three-word")) {
                    System.out.println(" ");
                    Azarya_U1SA_Black.main(args);
                }
            }
            else if (twoVsThree.equals("2") | twoVsThree.equals("three-word")) {
                System.out.println(" ");
                Azarya_U1SA_Black.main(args);
                System.out.println("");
                System.out.println("\nIs this the correct app?");
                System.out.println("Type \"1\" or \"two-word\" to go to two-word");
                System.out.println("Type \"0\" or \"YES\" if it's the correct application");
                String correctApp1 = kb.nextLine();
                if (correctApp1.equals("1") | correctApp1.equals("two-word")) {
                    System.out.println(" ");
                    TwoWordPhrase.main(args);
                }
            }
            else {
                System.out.println("ERROR 402: please put the correct selection");
                System.out.println("Remember, it's case sensitive");
                return;
            }

        }
        else if (selection.equals("2S") | selection.equals("Books Borrowed")
                | selection.equals("2S. Books Borrowed") ) {
            System.out.println(" ");
            Azarya_U1SA_Blue.main(args);
        }
        else if (selection.equals("3S") | selection.equals("Area/Volume of Cylinder")
                | selection.equals("3S. Area/Volume of Cylinder") ) {
            System.out.println(" ");
            Azarya_U1SA_Green.main(args);
        }

        //error
        else {
            System.out.println("ERROR 401: please put the correct selection");
            System.out.println("Remember, it's case sensitive");
            return;
        }

        //ending
        System.out.println(" ");
        System.out.println("\nCongratulations! You have successfully reach the end of our application");
        System.out.println("\nDo you want to go back to the home page?");
        System.out.println("Type \"1\" or \"YES\" to go to back to home page");
        System.out.println("Type \"0\" or \"NO\" to exit");
        String ending = kb.nextLine();

        if (ending.equals("1") | ending.equals("YES")) {
            addViewer++;
            HelloWorldApplication.main(args, username);
        }
        else if (ending.equals("0") | ending.equals("NO")) {
            System.out.println("\nThank you for using our services");
            System.out.println("We wish to see you next time!");
        }

        }
    }
