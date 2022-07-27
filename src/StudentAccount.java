public class StudentAccount extends BankAccount {
    private final double maxDepositAmount;

    public StudentAccount(double balance, String accountNumber, double maxDepositAmount) {
        super(balance, accountNumber);
        this.maxDepositAmount = maxDepositAmount;
    }

    public double getMaxDepositAmount() {
        return maxDepositAmount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalace()) {
            setBalace(getBalace() - amount);
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount <= maxDepositAmount) {
            setBalace(getBalace() + amount);
        }
    }

    @Override
    public String toString() {
        return "StudentAccount{" +
                "balace=" + getBalace() +
                ", accountNumber='" + getAccountNumber() + '\'' +
                ", maxDepositAmount=" + maxDepositAmount +
                '}';
    }
}
