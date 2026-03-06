	package Level_03;
	import java.util.Arrays;

	public class FactorUtils {

	    // Find factors
	    public static int[] findFactors(int number) {
	        int count = 0;
	        for (int i = 1; i <= number; i++) if (number % i == 0) count++;
	        int[] factors = new int[count];
	        int idx = 0;
	        for (int i = 1; i <= number; i++) if (number % i == 0) factors[idx++] = i;
	        return factors;
	    }

	    // Greatest factor
	    public static int greatestFactor(int[] factors) {
	        return factors[factors.length - 1];
	    }

	    // Sum of factors
	    public static int sumFactors(int[] factors) {
	        int sum = 0;
	        for (int f : factors) sum += f;
	        return sum;
	    }

	    // Product of factors
	    public static long productFactors(int[] factors) {
	        long prod = 1;
	        for (int f : factors) prod *= f;
	        return prod;
	    }

	    // Product of cubes
	    public static long productCubeFactors(int[] factors) {
	        long prod = 1;
	        for (int f : factors) prod *= Math.pow(f, 3);
	        return prod;
	    }

	    public static void main(String[] args) {
	        int number = 12;
	        int[] factors = findFactors(number);
	        System.out.println("Factors: " + Arrays.toString(factors));
	        System.out.println("Greatest factor: " + greatestFactor(factors));
	        System.out.println("Sum of factors: " + sumFactors(factors));
	        System.out.println("Product of factors: " + productFactors(factors));
	        System.out.println("Product of cubes of factors: " + productCubeFactors(factors));
	    }
	}