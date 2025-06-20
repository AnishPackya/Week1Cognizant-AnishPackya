package FinancialForecasting;

import java.util.ArrayList;
import java.util.List;

// Model class for monthly revenue
class MonthlyRevenue {
    private String month;
    private double revenue;

    public MonthlyRevenue(String month, double revenue) {
        this.month = month;
        this.revenue = revenue;
    }

    public String getMonth() {
        return month;
    }

    public double getRevenue() {
        return revenue;
    }

    public void display() {
        System.out.println(month + ": ₹" + revenue);
    }
}

// Forecast Engine class
public class ForecastEngine {

    private List<MonthlyRevenue> revenueData;

    public ForecastEngine() {
        revenueData = new ArrayList<>();

        // Sample past data
        revenueData.add(new MonthlyRevenue("January", 120000));
        revenueData.add(new MonthlyRevenue("February", 135000));
        revenueData.add(new MonthlyRevenue("March", 142500));
        revenueData.add(new MonthlyRevenue("April", 150000));
    }

    // Display all revenues
    public void displayRevenueHistory() {
        System.out.println("Revenue History:");
        for (MonthlyRevenue record : revenueData) {
            record.display();
        }
    }

    // Calculate average revenue
    public double calculateAverageRevenue() {
        double total = 0;
        for (MonthlyRevenue record : revenueData) {
            total += record.getRevenue();
        }
        return total / revenueData.size();
    }

    // Forecast next month's revenue
    public double forecastNextMonthRevenue() {
        return calculateAverageRevenue() * 1.05; // 5% projected growth
    }

    // Main method to test
    public static void main(String[] args) {
        ForecastEngine engine = new ForecastEngine();

        engine.displayRevenueHistory();

        double average = engine.calculateAverageRevenue();
        System.out.println("\nAverage Monthly Revenue: ₹" + average);

        double forecast = engine.forecastNextMonthRevenue();
        System.out.println("Forecasted Revenue for Next Month: ₹" + forecast);
    }
}
