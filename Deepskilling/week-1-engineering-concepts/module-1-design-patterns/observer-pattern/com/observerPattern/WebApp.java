package com.observerPattern;

public class WebApp implements Observer {
    @Override
    public void update(double price) { System.out.println("Web Dashboard updated. New Price: $" + price); }
}