package EcommerceSearchEngine;

import java.util.ArrayList;
import java.util.List;

// Product class
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.println("Product: " + name + " | Price: ₹" + price);
    }
}

// Search Engine class
public class SearchEngine {

    private List<Product> products;

    public SearchEngine() {
        products = new ArrayList<>();

        // Sample product list
        products.add(new Product("iPhone 15", 79999));
        products.add(new Product("Samsung Galaxy S23", 69999));
        products.add(new Product("Redmi Note 12", 15999));
        products.add(new Product("Apple Watch", 35999));
        products.add(new Product("Noise Smartwatch", 2999));
    }

    // Search method
    public List<Product> search(String keyword) {
        List<Product> result = new ArrayList<>();
        keyword = keyword.toLowerCase();

        for (Product product : products) {
            if (product.getName().toLowerCase().contains(keyword)) {
                result.add(product);
            }
        }

        return result;
    }

    // Main method to test
    public static void main(String[] args) {
        SearchEngine engine = new SearchEngine();

        System.out.println("Searching for 'apple':");
        List<Product> results = engine.search("apple");

        if (results.isEmpty()) {
            System.out.println("No products found.");
        } else {
            for (Product product : results) {
                product.display();
            }
        }
    }
}

