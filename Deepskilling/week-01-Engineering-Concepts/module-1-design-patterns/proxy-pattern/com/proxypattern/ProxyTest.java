package com.proxypattern;

public class ProxyTest {
    public static void main(String[] args) {
        Image image = new ProxyImage("high_res_photo.jpg");

        System.out.println("Proxy created. Real image not loaded yet.");

        // Image will be loaded from disk now
        image.display();

        System.out.println("---");

        // Image will not be loaded from disk this time (cached)
        image.display();
    }
}
