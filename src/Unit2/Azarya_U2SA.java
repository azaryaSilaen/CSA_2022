package Unit2;/*
Author: Azarya Silaen
 */

public class Azarya_U2SA {

    public static void main (String argos[]){
        System.out.println(vowelOrCons("P"));
        System.out.println(vowelOrCons("a"));
        System.out.println(vowelOrCons("E"));
        System.out.println(vowelOrCons("Pop"));
        System.out.println("");
        System.out.println(validKey(12356));
        System.out.println(validKey(123));
        System.out.println(validKey(663));
        System.out.println(validKey(624));
        System.out.println("");
        getSeason(1);
        getSeason(15);
        getSeason(6);
        System.out.println("");
        System.out.println(yearlyTotal(2.5, 2017, 'N'));
        System.out.println(yearlyTotal(2.5, 2017, 'T'));
        System.out.println(yearlyTotal(2.5, 2000, 'P'));
        System.out.println(yearlyTotal(2.5, 2020, 'T'));

    }

public static String vowelOrCons(String letter) {
        if (letter.length() > 1) return "Error";
            //A, E, I, O, U.
        else if (letter.equalsIgnoreCase("a") ||
                letter.equalsIgnoreCase("e") ||
                letter.equalsIgnoreCase("i") ||
                letter.equalsIgnoreCase("o") ||
                letter.equalsIgnoreCase("u")) {
            return "Vowel";
        }
        else {
            return "Consonant";
        }
    }

    public static boolean validKey(int key) {
        return (key / 100 < 10 & key / 100 >= 1)
                & (key / 100 > key % 10 & key / 100 > (key & 100 / 10))
                & key % 100 / 10 < key % 10;
    }

    public static void getSeason(int month) {
        if (month == 1) System.out.println("January - Summer");
        else if (month == 2) System.out.println("February - Summer");
        else if (month == 3) System.out.println("March - Autumn");
        else if (month == 4) System.out.println("April - Autumn");
        else if (month == 5) System.out.println("May - Autumn");
        else if (month == 6) System.out.println("June - Winter");
        else if (month == 7) System.out.println("July - Winter");
        else if (month == 8) System.out.println("August - Winter");
        else if (month == 9) System.out.println("September - Spring");
        else if (month == 10) System.out.println("October - Spring");
        else if (month == 11) System.out.println("November - Spring");
        else if (month == 12) System.out.println("December - Summer");
        else System.out.println("Error. Incorrect month number");

    }

    public static double yearlyTotal(double daily, int year, char taxCode) {
        int days;
        if ((year%100 == 0) & (year%400 != 0)) {
            days = 365;
        }
        else if (year%4 == 0) {
            days = 366;
        }
        else {
            days = 365;
        }

        double total = daily*days;

        if (taxCode == 'T') {
            total = total*1.06;
        }

        return total;
    }


}

