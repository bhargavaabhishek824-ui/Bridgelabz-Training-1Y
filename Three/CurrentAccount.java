package Three;

class CurrentAccount extends BankAccount implements Loanable {
    private final double interestRate = 0.02; 

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan approved for Current Account: " + amount);
        } else {
            System.out.println("Loan not eligible for Current Account.");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance > 10000;
    }
}