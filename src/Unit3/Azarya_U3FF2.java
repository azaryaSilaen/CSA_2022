package Unit3;/*
Author: Azarya Silaen
 */

public class Azarya_U3FF2 {
    public static void main(String[] args) {
        int t = 0;
        for (int p = 1; p <= 4; p++)
            for (int q = 1; q <= 4; q++)
                t++;
        System.out.println("t = " + t);


        //calling method
        System.out.println();
        printTriangle(4);
        System.out.println(replace("every","e","3"));
        System.out.println(replace("every","v","x"));
        System.out.println(encryptText("programming"));
        System.out.println(encryptText("Hello There"));

    }

    public static void printTriangle(int n) {

        //outside num object (so it doesn't get reseted)
        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static String replace(String text, String chr1, String chr2) {
       return text.replaceAll(chr1, chr2);
    }

    public static String encryptText(String text)
    {
        String newWord = "";
        text = text.replaceAll(" ", "");
        for(int i = 0; i < text.length(); i+=2)
        {
           newWord += text.substring(i, i+1);
        }
        return newWord;
    }


}
