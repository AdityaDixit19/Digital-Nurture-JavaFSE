package com.example.Loan_ws;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@SpringBootApplication
@EnableDiscoveryClient
public class LoanWsApplication {
	public static void main(String[] args) {
		SpringApplication.run(LoanWsApplication.class, args);
	}
}
