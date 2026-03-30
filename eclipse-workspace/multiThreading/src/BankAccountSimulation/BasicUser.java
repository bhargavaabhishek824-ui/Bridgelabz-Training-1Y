package BankAccountSimulation;
class BasicUser implements Runnable {
    BankAccount account;

    BasicUser(BankAccount acc) {
        this.account = acc;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Basic User: " + account.getAccountHolder() +
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