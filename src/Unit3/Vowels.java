package Unit3;/*
Author: Azarya Silaen
 */

public class Vowels {
    public static void main(String[] args) {
        System.out.println(countVowels("AzaryalahMAMA"));
    }

    public static int countVowels (String sentence) {
        int count = 0;
        String newSentence = sentence.toLowerCase();
    for (int i = sentence.length()-1; i >= 0; i--) {
        char character = newSentence.charAt(i);
        if (character == 'a' | character == 'e' | character == 'i' | character == 'o' | character == 'u' ) {
            count++;
        }
    }
        return count;
    }
}
