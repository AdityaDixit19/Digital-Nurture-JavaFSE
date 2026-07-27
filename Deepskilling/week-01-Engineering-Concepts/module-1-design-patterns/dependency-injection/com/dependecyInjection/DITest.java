package com.dependecyInjection;

public class DITest {
    public static void main(String[] args) {
        // Manually injecting the dependency (Spring does this automatically via @Autowired)
        CustomerRepository repo = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repo);
        service.fetchCustomer("101");
    }
}