package BankAccountSimulation;
class PremiumUser implements Runnable {
    BankAccount account;

    PremiumUser(BankAccount acc) {
        this.account = acc;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Premium User: " + account.getAccountHolder() +
                    " | Priority: " + Thread.currentThread().getPriority() +
                    " | Checking Balance (" + i + ")");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}