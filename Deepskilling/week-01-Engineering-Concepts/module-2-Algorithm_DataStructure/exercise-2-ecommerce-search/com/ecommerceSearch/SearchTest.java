package com.ecommerceSearch;
import java.util.Arrays;
public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
                new Product("P105", "MacBook Pro", "Electronics"),
                new Product("P101", "iPhone 15", "Electronics"),
                new Product("P109", "Ergonomic Chair", "Furniture"),
                new Product("P102", "Espresso Machine", "Appliances")
        };

        SearchService searchService = new SearchService();

        Product foundLinear = searchService.linearSearch(products, "P109");
        System.out.println(foundLinear);

        Arrays.sort(products);

        Product foundBinary = searchService.binarySearch(products, "P102");
        System.out.println(foundBinary);
    }
}