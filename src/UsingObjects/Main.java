package UsingObjects;/*
Author: Azarya Silaen
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        //house exercise

        //object

        House house = new House();

        house.addRoof();
        house.addBase();
        house.addWalk();

        /*
        //Store product exercise

        //input
        System.out.print("Label: ");
        String label = kb.nextLine();
        System.out.print("Price: ");
        int price = kb.nextInt();
        System.out.print("Category: ");
        kb.nextLine();
        String category = kb.nextLine();
        System.out.println("Does it has expiration date?");
        boolean hasExpiration = kb.nextBoolean();
        System.out.print("stock: ");
        int stock = kb.nextInt();

        //constructor object
        StoreProduct product1 = new StoreProduct(label, price, category, hasExpiration, stock);
        StoreProduct product2 = new StoreProduct(label, price, stock);
        StoreProduct product3 = new StoreProduct(label, price);
        StoreProduct product4 = new StoreProduct(label, price, category, hasExpiration);

        //output
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);

         */

        /* Stock exercise

        //input
        System.out.print("Ticker Symbol: ");
        String tickerSymbol = kb.nextLine();
        System.out.print("Company: ");
        String companyName = kb.nextLine();
        System.out.print("Price: ");
        int price = kb.nextInt();
        System.out.print("Total Shares: ");
        int totalShares = kb.nextInt();

        //constructor
        Stock stock = new Stock(tickerSymbol, companyName, price,totalShares);
        Stock stock1 = new Stock();

        //output
        System.out.println(" ");
        System.out.println(stock);
        System.out.println(stock1);

         */

        /* Dog exercise

        //input
        System.out.print("Name: ");
        String name = kb.nextLine();
        System.out.print("Breed: ");
        String breed = kb.nextLine();
        System.out.print("Weight: ");
        double weight = kb.nextDouble();

        //constructor initialize
        Dog dog1 = new Dog(name, breed, weight);
        Dog dog2 = new Dog(name, weight);

        //output
        System.out.println("\nDog 1" + '\n' + dog1);
        System.out.println("Dog 2" + '\n' + dog2);

         */

        /* Car exercise

        //Request input from user to create 4 different cars using the 4 different constructors.
        //Print the 4 cars.
        //String make, String model, int numberOfDoors, double topSpeed, double price


        //input
        System.out.print("Make: ");
        String make = kb.nextLine();
        System.out.print("Model: ");
        String model = kb.nextLine();
        System.out.print("Number of doors: ");
        int numberOfDoors = kb.nextInt();
        System.out.print("Top speed: ");
        double topSpeed = kb.nextDouble();
        System.out.print("Price: ");
        double price = kb.nextDouble();

        //* A secondary constructor that does not include numberOfDoors, which should default to 4
        //* A secondary constructor that does not include make or model; both default to "unknown"
        //* A secondary constructor that does not include topSpeed or price; default to 90 and 0 respectively.

        //output
        Car car1 = new Car(make, model, numberOfDoors, topSpeed, price);
        Car car2 = new Car(make, model, topSpeed, price);
        Car car3 = new Car(numberOfDoors, topSpeed, price);
        Car car4 = new Car(make, model, numberOfDoors);

        System.out.println("\n" + "Car 1\n" + car1);
        System.out.println("\n" + "Car 2\n" + car2);
        System.out.println("\n" + "Car 3\n" + car3);
        System.out.println("\n" + "Car 4\n" + car4);
         */

    }
}
