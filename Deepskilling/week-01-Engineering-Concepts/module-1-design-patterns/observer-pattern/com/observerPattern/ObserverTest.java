package com.observerPattern;

public class ObserverTest {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        market.register(new MobileApp());
        market.register(new WebApp());

        market.setStockPrice(150.50); // Both apps will instantly print the new price
    }
}
