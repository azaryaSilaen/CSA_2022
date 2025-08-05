package UsingObjects;/*
Author: Azarya Silaen
 */

public class Stock {

    private String tickerSymbol;
    private String companyName;
    private int price;
    private double percentChange;
    private int totalShares;
    private long marketCap;

    //tickerSymbol (and convert the string to uppercase)
    //companyName
    //price
    //totalShares
    //
    //percentChange should default to zero.
    //marketCap is calculated by multiplying totalShares by price

    public Stock (String tickerSymbol, String companyName, int price, int totalShares) {
        this.tickerSymbol = tickerSymbol.toUpperCase();
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;
        percentChange = 0;
        marketCap = totalShares*price;
    }

    //tickerSymbol: "NOSYM"
    //companyName: "Not set"
    //price (int): 0
    //percentChange: 0
    //totalShares: 0
    //marketCap: is calculated by multiplying totalShares by price

    public Stock () {
        tickerSymbol = "NOSYM";
        companyName = "Not set";
        price = 0;
        percentChange = 0;
        totalShares = 0;
        marketCap = totalShares*price;
    }

    //Ticker Symbol: GOOG
    //Company: Google, Inc.
    //Current Price: $802 (+7.2%)
    //Market Cap: $538000000000

    @Override
    public String toString() {
        return "tickerSymbol: " + tickerSymbol + '\n' +
                "Company: " + companyName + '\n' +
                "Current Price: $" + price + "(" + percentChange + "%)" + '\n' +
                "Market Cap: " + marketCap + '\n';
    }
}
