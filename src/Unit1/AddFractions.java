package Unit1;/*
Author: Azarya Silaen
 */
import java.util.Scanner;
public class AddFractions {
    public static int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;

       //don't change anything below!

        //output
        //put your question here
        // a/b + c/d
        System.out.println();
        System.out.println("The numerator of first fraction is " );
        a = kb.nextInt();
        System.out.println("The denominator of first fraction is " );
        b = kb.nextInt();
        System.out.println("The numerator of second fraction is " );
        c = kb.nextInt();
        System.out.println("The denominator of second fraction is " );
        d = kb.nextInt();

        // Unchangeable variable
        final int firstNumerator = a;
        final int firstDenominator = b;
        final int secondNumerator = c;
        final int secondDenominator = d;

        final int numResult = firstNumerator*secondDenominator + firstDenominator*secondNumerator;
        final int denResult = firstDenominator*secondDenominator;

        final int sumNum = (numResult - (denResult*(numResult/denResult)));

        //result
        System.out.print("\nThe sum of " + firstNumerator + "/" + firstDenominator + " + " + secondNumerator + "/" + secondDenominator + " = " );

        //ifFormula
        if (0 < numResult / denResult) {
    System.out.print(numResult / denResult + " ");
}

        if (0 < sumNum) {
    System.out.print( sumNum/gcdByEuclidsAlgorithm(sumNum, denResult) + "/" + denResult/gcdByEuclidsAlgorithm(sumNum, denResult));

            //decimal answer
            System.out.print(" or " + String.format("%.2f", (numResult / denResult + ((double)(sumNum/gcdByEuclidsAlgorithm(sumNum, denResult))/(denResult/gcdByEuclidsAlgorithm(sumNum, denResult))))));
}
        //space
        System.out.println();
    }
}
