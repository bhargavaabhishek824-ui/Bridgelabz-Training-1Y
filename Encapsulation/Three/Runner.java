package Three;
import java.util.*;
public class Runner {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        BankAccount acc1 = new SavingsAccount("SB101", "Namrita", 8000);
        BankAccount acc2 = new CurrentAccount("CA202", "Mohit", 15000);

        accounts.add(acc1);
        accounts.add(acc2);

        for (BankAccount acc : accounts) {
            acc.displayDetails();

            acc.deposit(2000);
            acc.withdraw(1000);

            System.out.println("Interest: " + acc.calculateInterest());

            if (acc instanceof Loanable) {
                Loanable loan = (Loanable) acc;
                loan.applyForLoan(50000);
            }

            System.out.println("----------------------------");
        }
    }
}