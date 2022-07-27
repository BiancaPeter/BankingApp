public abstract class BankAccount {
    private double balace;
    private String accountNumber;

    public BankAccount(double balace, String accountNumber) {
        this.balace = balace;
        this.accountNumber = accountNumber;
    }

    public double getBalace() {
        return balace;
    }

    public void setBalace(double balace) {
        this.balace = balace;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);

}
