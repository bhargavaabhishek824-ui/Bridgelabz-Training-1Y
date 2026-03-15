package Package_Assignment;
import com.bank.util.InterestCalculator;

public class Runner_4 {

    public static void main(String[] args) {

        InterestCalculator calc = new InterestCalculator();

        double P = 10000;   // Principal
        double R = 5;       // Rate
        double T = 2;       // Time

        double si = calc.calculateSimpleInterest(P, R, T);
        double ci = calc.calculateCompoundInterest(P, R, T);

        System.out.println("Principal: " + P);
        System.out.println("Rate: " + R);
        System.out.println("Time: " + T);

        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
    }
}