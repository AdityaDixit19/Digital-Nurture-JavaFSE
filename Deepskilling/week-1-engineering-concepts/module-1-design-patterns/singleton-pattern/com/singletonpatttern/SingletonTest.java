package com.singletonpatttern;
public class SingletonTest {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();


        System.out.println("Logger 1 Memory Address: " + logger1.hashCode());
        System.out.println("Logger 2 Memory Address: " + logger2.hashCode());

        if (logger1 == logger2) {
            System.out.println("SUCCESS: Both variables reference the identical Logger instance.");
        } else {
            System.out.println("FAILURE: Singleton pattern broken. Multiple instances exist.");
        }
    }
}