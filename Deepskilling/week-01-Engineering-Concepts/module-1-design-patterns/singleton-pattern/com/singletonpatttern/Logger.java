package com.singletonpatttern;

public class Logger {
    private static volatile Logger instance;
    private Logger() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to get the unique instance.");
        }
    }


    public static Logger getInstance() {
        if (instance == null) { // First check
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
