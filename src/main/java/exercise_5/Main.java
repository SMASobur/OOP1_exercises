package exercise_5;

public class Main {
    public static void main(String[] args) {
        // Create Products
        Product laptop = new Product("P1", "MacBook Air", 11000);
        Product mouse = new Product("P2", "Logitech Mouse", 499.90);
        Product keyboard = new Product("P3", "Logitech Keyboard", 800);

        // Create Order 1
        Order myOrder1 = new Order("ORD-2026-001");
        myOrder1.addProduct(laptop);
        myOrder1.addProduct(mouse);

        // Create Order 2
        Order myOrder2 = new Order("ORD-2026-002");
        myOrder2.addProduct(keyboard);
        myOrder2.addProduct(mouse);

        // Display results
        myOrder1.displayOrder();
        myOrder2.displayOrder();
    }
}
