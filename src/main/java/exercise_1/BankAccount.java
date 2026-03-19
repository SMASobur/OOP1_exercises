package exercise_1;

public class BankAccount {
    private String accountHolder;
    private double balance;

    //Default constructor
    public BankAccount(){
        this.accountHolder="Unknown";
        this.balance= 0;

    }

    // Constructor with both fields
    public BankAccount(String accountHolder, double initialBalance){
        setAccountHolder(accountHolder);
        this.balance =0;
        deposit(initialBalance);
    }

    // Constructor with only accountHolder (starting with 0 balance)
    public BankAccount(String accountHolder) {
        this(accountHolder, 0);
    }

    //Setter and Getter
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder == null || accountHolder.isEmpty()) {
            throw new IllegalArgumentException("Account holder name cannot be null or empty.");
        }
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance){
        if (balance>=0){
            this.balance = balance;
        }else {
            throw new IllegalArgumentException("Balance cannot be negative");
        }

    }



    // Methods

    public void deposit(double amount){
        if (amount>=0){
            balance +=amount;
            System.out.println("Deposited: SEK " + amount + ". New balance: SEK " + balance);
        }else {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
    }

    public void withdraw(double amount){
        if (amount>0){
            if (amount<=balance){
                balance-=amount;
                System.out.println("Withdrawn: SEK " + amount + ". New balance: SEK " + balance);
            }else {
                throw new IllegalArgumentException("Insufficent found. Current balance is: "+ balance);
                }
        }else {
            throw new IllegalArgumentException("Withdrawn amount must be positive.");
        }
    }

    public String getAccountInfo(){
        return "Account Holder: "+accountHolder + " | Balance: SEK " + balance ;
    }
}
