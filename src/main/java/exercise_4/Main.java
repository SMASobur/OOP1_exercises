package exercise_4;

public class Main {
    public static void main(String[] args) {

        // Creating multiple Product objects
        Product prod1 = new Product("p01", "Laptop", 1519);
        Product prod2 = new Product("P02", "Keyboard", 790.90);
        Product prod3 = new Product("P03", "Mouse", 199.90);

        // Updating data
        prod2.setPrice(8500.0);

        // Displaying
        System.out.println(prod1.getProductInfo());
        System.out.println(prod2.getProductInfo());
        System.out.println(prod3.getProductInfo());

    }
}
