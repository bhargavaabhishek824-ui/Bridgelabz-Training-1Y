package BankAccountSimulation;
public class BankSimulation {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Abhishek");
        BankAccount acc2 = new BankAccount("Rahul");
        BankAccount acc3 = new BankAccount("Amit");

        Thread t1 = new Thread(new PremiumUser(acc1));
        Thread t2 = new Thread(new RegularUser(acc2));
        Thread t3 = new Thread(new BasicUser(acc3));

        // Set priorities
        t1.setPriority(10); // Premium
        t2.setPriority(5);  // Regular
        t3.setPriority(1);  // Basic

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}