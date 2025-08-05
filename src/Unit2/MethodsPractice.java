package Unit2;/*
Author: Azarya Silaen
 */

public class MethodsPractice {
    public static void main(String[] args) {

        System.out.println(blackjack(5,20));
        System.out.println(blackjack(15,12));
        System.out.println(blackjack(5,5));
        System.out.println(blackjack(5,24));
        System.out.println(blackjack(RandomNum.Int(1,30), RandomNum.Int(1,30) ));
        System.out.println(blackjack(RandomNum.Int(1,30), RandomNum.Int(1,30) ));
    }

    public static boolean shareDigit(int num1, int num2) {
        boolean result = false;

        int oneNum1 = num1/10;
        int tensNum1 = num1%10;
        int oneNum2 = num2/10;
        int tensNum2 = num2%10;

        if ( oneNum1 == oneNum2 | oneNum1 == tensNum2 | tensNum1 == oneNum2 | tensNum1 == tensNum2) {
            result = true;
        }
        return result;
    }

    public static int blackjack(int card1, int card2) {
        if (card1 > 21 & card2 > 21) {
            return 0;
        }
        else if (card1 > 21) {
            return card2;
        }
        else if (card2 > 21) {
            return card1;
        }
        else return Math.max(card1, card2);
    }
}
