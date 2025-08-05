package Testing;/*
Author: Azarya Silaen
 */

public class cipher {
  public static void main(String[] args) {
    String plaintext = ".- --.. .- .-. -.-- .- / -.- .-. .. ... .... -. .- / .... .- ... .. .- -. / ... .. .-.. .- . -.";
    for (int i = 0; i < plaintext.length(); i++) {
        if (plaintext.charAt(i) == '.') {
            System.out.print("long");
        }
        else if (plaintext.charAt(i) == '-') {
            System.out.print("short");
        }
        else if (plaintext.charAt(i) == '/') {
        System.out.print("space");
        }
        else {
        System.out.print(" ");
        }
    }
  }
}
