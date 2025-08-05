package Unit3;/*
Author: Azarya Silaen
 */

public class BackwardsText {
    public static void main(String[] args) {
        System.out.println(textBackwards("fix it! don't need to worry about it, you already have too much worry in life"));
    }
    public static String textBackwards(String text){

        String backward = "";
        for (int i = text.length()-1; i >= 0; i--) {
            char character = text.toLowerCase().charAt(i);
            backward += character;
        }
        return backward;
    }

}
