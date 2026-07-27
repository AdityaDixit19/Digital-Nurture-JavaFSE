package com.financial_forecasting;

public class ForcastTest {
        public static void main(String[] args) {
            ForecastingService service = new ForecastingService();
            double initialInvestment = 10000.0;
            double annualGrowthRate = 0.08;
            int forecastYears = 5;
            double projectedValue = service.predictFutureValue(initialInvestment, annualGrowthRate, forecastYears);
            System.out.printf("Initial Value: $%.2f%n", initialInvestment);
            System.out.printf("Growth Rate: %.1f%%%n", (annualGrowthRate * 100));
            System.out.printf("Projected Value after %d years: $%.2f%n", forecastYears, projectedValue);
        }
    }
