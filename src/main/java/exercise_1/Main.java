package exercise_1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        IO.println("OOP-2 Exercises");
        System.out.println("=== Creating Bank Accounts ===\n");

        // Account 1: Using constructor with both fields
        BankAccount account1 = new BankAccount("Shanmuga Saravanan", 1000.50);
        System.out.println("Account 1 created:");
        System.out.println(account1.getAccountInfo());


        System.out.println("____________________________________\n");

        // Account 2: Using constructor with only account holder
        BankAccount account2 = new BankAccount("Abdus Sobur");
        System.out.println("Account 2 created:");
        System.out.println(account2.getAccountInfo());

        System.out.println("____________________________________\n");

        // Account 3: Using default constructor
        BankAccount account3 = new BankAccount();
        account3.setAccountHolder("Muthana Fouad");
        System.out.println("Account 3 created:");
        System.out.println(account3.getAccountInfo());

        System.out.println("\n=== Performing Transactions ===\n");

        // Account 1: transactions
        System.out.println("Account 1 (" + account1.getAccountHolder() + "):");
        account1.deposit(500.25);
        account1.withdraw(200.00);
        account1.withdraw(50.75);

        // Account 2: transactions
        System.out.println("\nAccount 2 (" + account2.getAccountHolder() + "):");
        account2.deposit(2500.00);
        account2.withdraw(100.00);
        account2.withdraw(300.50);

        // Account 3 transactions
        System.out.println("\nAccount 3 (" + account3.getAccountHolder() + "):");
        account3.deposit(150.00);
        account3.deposit(275.25);

        // Showing final status
        System.out.println("\n=== Final Account States ===");
        System.out.println(account1.getAccountInfo());
        System.out.println(account2.getAccountInfo());
        System.out.println(account3.getAccountInfo());





    }
}
