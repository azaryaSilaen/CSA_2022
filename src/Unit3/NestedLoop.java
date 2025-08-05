package Unit3;/*
Author: Azarya Silaen
 */

public class NestedLoop {
    public static void main(String[] args) {

        //slide 47
        for (int i = 4;i > 0;i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        //slide 48
        getRanNumsInRounds(4);
    }

    public static void getRanNumsInRounds (int num) {
        int totalSum = 0;

        for (int i = 1; i <= num; i++) {
            int sum = 0;
            System.out.print("Round " + i + "...");
            for (int j = 0; j < num; j++) {
                int random = randomizer(1,100);
                System.out.print(random + " ");
                sum += random;
            }
            System.out.print("= " + sum);
            totalSum += sum;
            System.out.println();
        }
        System.out.println();
        System.out.println("Sum = " + totalSum);
    }

    public static int randomizer (int min, int max) {
        int random = (int) (Math.random() * (max - min + 1) + min);
        return random;
    }
}
