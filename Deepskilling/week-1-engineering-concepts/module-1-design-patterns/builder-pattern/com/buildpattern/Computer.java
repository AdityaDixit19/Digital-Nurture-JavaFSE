package com.buildpattern;

public class Computer {
    // Required parameters
    private final String CPU;
    private final String RAM;

    // Optional parameters
    private final String storage;
    private final boolean hasGraphicsCard;
    private final boolean hasBluetooth;

    // Private constructor accepting the inner static Builder instance[cite: 2]
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasBluetooth = builder.hasBluetooth;
    }

    @Override
    public String toString() {
        return "Computer Specs [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage +
                ", GPU=" + hasGraphicsCard + ", Bluetooth=" + hasBluetooth + "]";
    }

    // Static nested Builder class[cite: 2]
    public static class Builder {
        private final String CPU;
        private final String RAM;

        private String storage = "256GB SSD"; // default value
        private boolean hasGraphicsCard = false;
        private boolean hasBluetooth = false;

        // Builder constructor enforcing required fields
        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        // Setter methods returning 'this' for method chaining[cite: 2]
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public Builder setBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        // Assembly function to return product[cite: 2]
        public Computer build() {
            return new Computer(this);
        }
    }
}

