package com.buildpattern;

public class BuilderTest {
    public static void main(String[] args) {
        // Build a basic Office Computer
        Computer officePC = new Computer.Builder("Intel i3", "8GB").build();

        // Build a high-performance Gaming Computer using fluent method chaining
        Computer gamingPC = new Computer.Builder("AMD Ryzen 9", "32GB")
                .setStorage("2TB NVMe SSD")
                .setGraphicsCard(true)
                .setBluetooth(true)
                .build();

        System.out.println(officePC);
        System.out.println(gamingPC);
    }
}
