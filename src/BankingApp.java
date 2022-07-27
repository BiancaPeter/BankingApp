public class BankingApp {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[3];
        Person person = new Person("Bianca", "Peter", accounts);
        BankAccount bankAccount = new SpendingAccount(300, "ROBT2364", 2000);
        BankAccount bankAccount1 = new StudentAccount(400, "ROHJU658", 3000);
        BankAccount bankAccount2 = new SpendingAccount(5000, "ROBT7586", 2000);

        person.addAccount(bankAccount);
        person.addAccount(bankAccount1);
        person.addAccount(bankAccount2);

        person.listAccounts();

//        System.out.println(bankAccount instanceof SpendingAccount);
//        System.out.println(bankAccount instanceof BankAccount);

        person.deposit(4000,"ROHJU658");
        System.out.println(bankAccount1.getBalace());

        person.withdraw(2301,"ROBT2364");
        System.out.println(bankAccount.getBalace());

        person.checkAccountDetails("ROHJU658");
        person.checkAccountDetails("ROHJU8");
        person.checkAccountDetails("ROBT7586");
    }
}
