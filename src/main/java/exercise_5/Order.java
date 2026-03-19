package exercise_5;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private List<Product> products;

    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    // Add a product to the list
    public void addProduct(Product p) {
        if (p != null) {
            products.add(p);
        }
    }

    // Remove a product from the list
    public void removeProduct(Product p) {
        products.remove(p);
    }

    // Calculate total price
    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    //Getter & Setters
    public String getOrderId() {
        return orderId;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            System.out.println( p.getProductInfo());
        }
        System.out.println("Total Order Value: SEK " + calculateTotal());
        System.out.println("------------------------------------------");
    }
}
