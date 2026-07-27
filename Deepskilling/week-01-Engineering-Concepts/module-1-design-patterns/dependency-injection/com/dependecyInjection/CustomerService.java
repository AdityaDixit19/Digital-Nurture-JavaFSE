package com.dependecyInjection;

public class CustomerService {
    // Dependency Injection via Constructor (The Spring Boot way)
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void fetchCustomer(String id) {
        System.out.println(repository.findCustomerById(id));
    }
}