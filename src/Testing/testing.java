package Testing;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class testing {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    //"kNoWLeDge iS poWeR"
    // -Francis Bacon-
    System.out.println("Koege i Poe"); //koegip
    //indexes (0,2,5,7,8    10      13,14,16)
    System.out.println("nwld s wr"); //nwldsr
    // indexes (1,3,4,6    11      15,17)
    //010110100 01 00101

    // possible solution
    String solution;
    do {
      solution = kb.nextLine();
      if (solutionValid(solution)) {
        System.out.println("it works!");
        System.out.println();
      }

    } while (!solution.equals("stop"));
  }
  public static boolean solutionValid(String password)
  {
    // DEFINE valid char
    String checker = "koegipnwldsr";

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

}
