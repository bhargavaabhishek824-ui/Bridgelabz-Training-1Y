package BankAccountSimulation;
class BankAccount {
    String accountHolder;

    BankAccount(String name) {
        this.accountHolder = name;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}