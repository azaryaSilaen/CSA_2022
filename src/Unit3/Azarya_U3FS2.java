package Unit3;/*
Author: Azarya Silaen
 */

public class Azarya_U3FS2 {
    public static void main(String[] args) {
        //printMultiplication(5);
        //System.out.println(addComma("pear apple lemon"));
        System.out.println(firstAndLast(123456));
    }
    public static void printMultiplication (int n) {
        for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i + "x" + j + "=" + (i*j) + " ");
            }
            System.out.println();
        }

    }

    public static String textBackwards(String text){

        String backward = "";
        for (int i = text.length()-1; i >= 0; i--) {
            char character = text.toLowerCase().charAt(i);
            backward += character;
        }
        return backward;
    }

    public static String addComma(String text) {
        String newWord = "";
        int  counter = 0;

        for (int i = text.length(); i > 0; i--) {
            if (text.charAt(i - 1) == ' ') {
                if (counter == 0) {
                    newWord += " dna ";
                    counter++;
                }
                else {
                    newWord += " ,";
                }
            }
            else  {
                newWord += text.substring(i-1, i);
            }
        }
        return textBackwards(newWord);
    }

    public static int firstAndLast(int num) {
        int digit1 = num%10;
        while (num > 0) {
            if (num <= 9) {
                break;
            }
            num/=10;
        }
        int digit2 = num;

        return digit1+digit2;
    }

    public static String mixString (String a, String b) {
        String newWord = "";
        return newWord;
    }

    public static int sumNumbers(String text) {
        // DEFINE valid char
        String checker = "1234567890";

        for (int i = 0;i < text.length(); i++ ) {

        }
        return 1;
    }



}
