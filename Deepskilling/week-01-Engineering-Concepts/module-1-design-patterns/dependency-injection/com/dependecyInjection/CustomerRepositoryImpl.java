package com.dependecyInjection;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(String id) { return "CustomerData_" + id; }
}