package exercise_2;


public class Main {
    static void main() {
        BankAccount account1 = new BankAccount("Sikdar", 1000.0);
        BankAccount account2 = new BankAccount("Shanmuga", 50.0);

        account1.deposit(500);
        account2.withdraw(20);

        System.out.println("Account 1: " + account1.getAccountHolder() + " | Balance: " + account1.getBalance());
        System.out.println("Account 2: " + account2.getAccountHolder() + " | Balance: " + account2.getBalance());
        System.out.println("--------------------------------------------------");


    }
}
