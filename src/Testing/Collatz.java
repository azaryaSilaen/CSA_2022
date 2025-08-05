package Testing;/*
Author: Azarya Silaen
 */


import java.math.BigInteger;

public class Collatz {
  public static void main(String[] args) {
      BigInteger steps = BigInteger.ZERO;
      //BigInteger num =  new BigInteger("");
      BigInteger num =  BigInteger.valueOf(17).pow(129827).multiply(BigInteger.valueOf(13).pow(93751));
      //BigInteger maxNum = BigInteger.valueOf(13).pow(191722);
      BigInteger maxNum = num.add(BigInteger.ONE);
      //BigInteger.valueOf(10);
      //BigInteger.valueOf(10).pow(500);
      BigInteger maxSteps = new BigInteger("0");
      BigInteger bigNum;

      //solved > has more than one loop
      //# > loops back to this number
      // 1x+1 (CAN'T be solved || proven to won't loop back)

      // 3x+1 (unsolved)

      // 5x+1 (solved)
      //5, 13#, 26#, 33#, 52#, 66#, 83#, 104#, 166#, 208#, 416#

      // 7x+1 (solved)
      // 3, 5, 6, 7, 9#, 10#

      for (BigInteger x = num; x.compareTo(maxNum) < 0; x = x.add(BigInteger.valueOf(1))) {
          bigNum = x;
          do {
              if (bigNum.remainder(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
                   bigNum = bigNum.divide(BigInteger.valueOf(2));
              }
              else {
                  bigNum = bigNum.multiply(BigInteger.valueOf(3));
                  bigNum = bigNum.add(BigInteger.ONE);
              }
              steps = steps.add(BigInteger.ONE);

          } while (!bigNum.equals(BigInteger.ONE) & !bigNum.equals(num));
          System.out.println(x + " \nsteps: " + steps);
          if (steps.compareTo(maxSteps) > 0) {
              maxSteps = steps;
          }
          if (bigNum.equals(num) && !bigNum.equals(BigInteger.ONE)) {
        System.out.println("we finally found it!");
        //break;
          }
          steps = BigInteger.ZERO;
      }
  }
}
