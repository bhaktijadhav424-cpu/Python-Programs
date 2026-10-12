class BankAccount {

    private String name;
    private int accountNumber;
    private double balance;

    BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit Successful");
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
        }
    }

    
    void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Final Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount b = new BankAccount("Bhakti", 1001, 5000);

        b.deposit(2000);
        b.withdraw(1500);

        b.display();
    }
}

//Deposit Successful
//Withdrawal Successful
//Account Holder: Bhakti
//Account Number: 1001
//Final Balance: 5500.0