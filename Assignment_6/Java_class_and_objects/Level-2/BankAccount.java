class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountHolder = "Amit";
        acc.accountNumber = "123456";
        acc.balance = 5000;
        acc.deposit(2000);
        acc.withdraw(1000);
        acc.displayBalance();
    }
}