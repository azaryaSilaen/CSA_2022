package Unit3;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class Password2 {

        public static void main(String[] args)
        {
            Scanner kb = new Scanner(System.in);
            // Prompt the user to enter their password and pass their string
            // to the passwordCheck method to determine if it is valid.
            System.out.print("enter your password: ");
            String password = kb.nextLine();
/* ARYA
            if (passwordCheck(password)) {
                System.out.println("Congratulation!");
            }
            else {
                System.out.println("your password is not valid");
            }
*/
            // PAPA
            /*if (isPasswordValid(password)) {
                System.out.println("Congratulation!");
            }
            else {
                System.out.println("your password is not valid");
            }

             */
            // PAPA
        }

        public static boolean passwordCheck(String password)
        {
            String checker = "abcdefghijklmnopqrstuvwxyz1234567890";
            int numCheck = checker.length()-1;
            int passCheck = password.length()-1;
            if (password.length() < 8) return false;

            for (int i = 0; i <= passCheck; i++) {
                int j = 0;
                do {
                    if (!password.substring(i, i+1).equalsIgnoreCase(checker.substring(j, j+1))) {
                        j++;
                    }

                    if (j > numCheck) {
                        return false;
                    }
                }
                while (!password.substring(i, i+1).equals(checker.substring(j, j+1)));
            }

            //for (int j = 0; j <= numCheck; j++) {
            //if (!password.substring(i, i+1).equals(checker.substring(j, j+1))) return false;
            //                }
            // Create this method so that it checks to see that the password
            // is at least 8 characters long and only contains letters
            // and numbers.

            return true;
        }

    /*public static boolean isPasswordValid(String password)
    {
        // CHECK if password length valid
        if (password.length() < 8) return false;

        // DEFINE valid char
        String checker = "abcdefghijklmnopqrstuvwxyz1234567890";

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

     */

}
