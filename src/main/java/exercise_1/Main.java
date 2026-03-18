package exercise_1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        IO.println("OOP-1 Exercises");
        System.out.println("____________________________________");

        // Account 1: Using constructor with both fields
        BankAccount account1 = new BankAccount("Shanmuga Saravanan", 1000.50);
        System.out.println("Account 1 created:");
        System.out.println(account1.getAccountInfo());
        account1.deposit(50);


        System.out.println("____________________________________");

        // Account 2: Using constructor with only account holder
        BankAccount account2 = new BankAccount("Abdus Sobur");
        System.out.println("\nAccount 2 created:");
        System.out.println(account2.getAccountInfo());

        System.out.println("____________________________________");

        // Account 3: Using default constructor
        BankAccount account3 = new BankAccount();
        account3.setAccountHolder("Muthana Fouad");
        System.out.println("\nAccount 3 created:");
        System.out.println(account3.getAccountInfo());
        account3.setBalance(100);
        System.out.println(account3.getAccountInfo());





    }
}
