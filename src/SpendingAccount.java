public class SpendingAccount extends BankAccount {
    private double maxDepositAmount;

    public SpendingAccount(double balace, String accountNumber, double maxDepositAmount) {
        super(balace, accountNumber);
        this.maxDepositAmount = maxDepositAmount;
    }

    public double getMaxDepositAmount() {
        return maxDepositAmount;
    }

    public void setMaxDepositAmount(double maxDepositAmount) {
        this.maxDepositAmount = maxDepositAmount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalace() + maxDepositAmount) {
            setBalace(getBalace() - amount);
        }
    }

    @Override
    public void deposit(double amount) {
        setBalace(getBalace() + amount);
    }

    @Override
    public String toString() {
        return "SpendingAccount{" +
                "balace=" + getBalace() +
                ", accountNumber='" + getAccountNumber() + '\'' +
                ", maxDepositAmount=" + maxDepositAmount +
                '}';
    }
}
