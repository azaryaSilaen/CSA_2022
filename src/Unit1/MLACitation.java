package Unit1;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class MLACitation {
    public static void main(String[] args) {
        Scanner citation = new Scanner(System.in);

        System.out.println("Welcome to MLA Citation");
        System.out.println("\nEnter the author's name as 'Last name, First name': ");
        String author = citation.nextLine();
        System.out.println("Enter the title of the book: ");
        String title = citation.nextLine();
        System.out.println("Enter the publisher of the book: ");
        String publisher = citation.nextLine();
        System.out.println("Enter the year the book was published:");
        int year = citation.nextInt();
        System.out.println(author +". " + title +". " + "\n" + publisher + ", " + year + ".");

    }
}
