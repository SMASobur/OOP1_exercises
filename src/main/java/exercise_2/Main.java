package exercise_2;


public class Main {
    static void main() {
        BankAccount account1 = new BankAccount("Abdus Sobur", 1000.0);
        BankAccount account2 = new BankAccount("Ragavi", 50.0);

        account1.deposit(500);
        account2.withdraw(20);

        System.out.println("Account 1: " + account1.getAccountHolder() + " | Balance: " + account1.getBalance());
        System.out.println("Account 2: " + account2.getAccountHolder() + " | Balance: " + account2.getBalance());
        System.out.println("--------------------------------------------------");


        Customer cust1 = new Customer("U01", "Ragavi", "ragavi@mail.com", "071234567");
        Customer cust2 = new Customer("U02", "Abdus Sobur", "sikdar@mail.com");

        cust2.setEmail("sir.se@gmail.com"); // Updating email
        cust2.setPhoneNumber("078945612"); // Updating phone

        System.out.println(cust1.getCustomerInfo());
        System.out.println(cust2.getCustomerInfo());


        //Constructor
        class Customer {
            private int customerId;
            private String name;
            private String email;

            public Customer(int customerId, String name, String email) {
                this.customerId = customerId;
                this.name = name;
                this.email = email;
            }

            public int getCustomerId() { return customerId; }

            public String getName() { return name; }
            public void setName(String name) { this.name = name; }

            public String getEmail() { return email; }
            public void setEmail(String email) { this.email = email; }

            public String getCustomerInfo() {
                return "ID: " + customerId + " | Name: " + name + " | Email: " + email;
            }
        }

    }
}
