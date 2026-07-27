package com.observerPattern;

public class MobileApp implements Observer {
    @Override
    public void update(double price) { System.out.println("Mobile UI updated. New Price: $" + price); }
}
