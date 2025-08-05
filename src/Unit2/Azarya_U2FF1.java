package Unit2;/*
Author: Azarya Silaen
 */

public class Azarya_U2FF1 {

        public static void main (String argos[]){

            //main println
            System.out.println(generateNumericPass(2));
            System.out.println(generateNumericPass(4));
            System.out.println(generateNumericPass(3));

            System.out.println(generateTextPass("Procedural", "Programming"));
            System.out.println(generateTextPass("Program", "Java"));
            System.out.println(generateTextPass("Cat", "Dog"));
        }

        //methods
    public static int randomizer (int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min); //1 mark random
    }

        public static int generateNumericPass (int digits){
            //Minimum number = 10(n-1)   	for example: if n = 3 -> n-1 = 2 ->  10^2 = 100
            //Maximum number = (10n)- 1  	for example: if n = 3 -> (103) - 1 = 1000 - 1 = 999

           int minimum = (int)Math.pow(10, digits-1); //1 mark
           int maximum = (int)Math.pow(10, digits)-1; //1 mark

           return randomizer(minimum, maximum); //1 mark return
        }

        public static String generateTextPass (String word1, String word2) {

            if (word1.length() >= 8 & word2.length() >= 8) {  //2 mark for length verification
                return word1.substring(0, word1.length() / 2) + word2.substring(word2.length()/2).toLowerCase();
                //1 mark converting to lowercase
                //1 mark for using substring correctly
            }
            return (word2+word1).toLowerCase(); //1 mark for returning short string
            //1 mark for returning the appropriate string
        }
}
