public class Person {
    private String firstName;
    private String lastName;
    private BankAccount[] accountList;
    private int numberOfAccounts = 0;

    public Person(String firstName, String lastName, BankAccount[] accountList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountList = accountList;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BankAccount[] getAccountList() {
        return accountList;
    }

    public void setAccountList(BankAccount[] accountList) {
        this.accountList = accountList;
    }

    public void addAccount(BankAccount account) {
        accountList[numberOfAccounts] = account;
        numberOfAccounts++;
    }

    public void listAccounts() {
        for (int i = 0; i < accountList.length; i++) {
            System.out.println("Numarul contului: " + accountList[i].getAccountNumber() + " soldul contului " + accountList[i].getBalace());
            if (accountList[i] instanceof StudentAccount) {
                System.out.println("Tipul contului este StudentAccount");
            } else {
                System.out.println("Tipul contului este SpendingAccount");
            }
        }
    }

    public void deposit(double amount, String accountNumber) {
        int withdrawalAccountPosition = search(accountNumber);
        if (withdrawalAccountPosition == -1) {
            System.out.println("Acest numar de cont nu se afla in lista");
        } else {
            accountList[withdrawalAccountPosition].deposit(amount);
        }
    }

    public void withdraw(double amount, String accountNumber) {
        int withdrawalAccountPosition = search(accountNumber);
        if (withdrawalAccountPosition == -1) {
            System.out.println("Acest numar de cont nu se afla in lista");
        } else {
            accountList[withdrawalAccountPosition].withdraw(amount);
        }
    }

    private int search(String accountNumber) {
        for (int i = 0; i < accountList.length; i++) {
            if (accountNumber.equals(accountList[i].getAccountNumber())) {
                return i;
            }
        }
        return -1;
    }

    public void checkAccountDetails(String accountNumber) {
        int withdrawalAccountPosition = search(accountNumber);
        if (withdrawalAccountPosition == -1) {
            System.out.println("Acest numar de cont nu se afla in lista");
        } else {
            System.out.println(accountList[withdrawalAccountPosition]);
        }
    }
}
