package Unit2;/*
Author: Azarya Silaen
 */


import java.util.logging.Logger;

public class RandomNum { ;

    public static int Int (int min, int max) {
        int random = (int) (Math.random() * (max - min + 1) + min);
        return random;
    }

    public static double Double (double min, double max) {
        double random = (Math.random()*(max-min+1)+min);
        return random;
    }

}


