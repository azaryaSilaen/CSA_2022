package UsingObjects;/*
Author: Azarya Silaen
 */

public class StoreProduct {

    private String label;
    private int price;
    private String category;
    private boolean hasExpiration;
    private int stock;

    //Write four constructors:
    //* The main constructor
    //* A secondary constructor that does not have a category or an expiration (category defaults to "misc", hasExpiration defaults to false)
    //* A secondary constructor that does not have a category, expiration, or stock (stock defaults to 0)
    //* A secondary constructor that just does not have stock

    public StoreProduct (String label, int price, String category, boolean hasExpiration, int stock) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }
    public StoreProduct (String label, int price, int stock) {
        this.label = label;
        this.price = price;
        category = "misc";
        hasExpiration = false;
        this.stock = stock;
    }
    public StoreProduct (String label, int price) {
        this.label = label;
        this.price = price;
        category = "misc";
        hasExpiration = false;
        stock = 0;
    }
    public StoreProduct (String label, int price, String category, boolean hasExpiration) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        stock = 0;
    }

    @Override
    public String toString() {
        return "StoreProduct{" +
                "label='" + label + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", hasExpiration=" + hasExpiration +
                ", stock=" + stock +
                '}';
    }
}
