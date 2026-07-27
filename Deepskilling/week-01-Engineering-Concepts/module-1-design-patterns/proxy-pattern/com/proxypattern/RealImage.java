package com.proxypattern;

public class RealImage implements Image {
    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName); // Expensive operation happens on creation
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading heavy image from disk: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
