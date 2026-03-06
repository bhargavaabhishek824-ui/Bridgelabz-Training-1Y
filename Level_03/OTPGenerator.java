package Level_03;
import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {

    // Generate single 6-digit OTP
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    // Generate 10 OTPs
    public static int[] generateOTPs(int count) {
        int[] otps = new int[count];
        for (int i = 0; i < count; i++) otps[i] = generateOTP();
        return otps;
    }

    // Check uniqueness
    public static boolean areUnique(int[] otps) {
        Set<Integer> set = new HashSet<>();
        for (int otp : otps) set.add(otp);
        return set.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otps = generateOTPs(10);
        System.out.print("Generated OTPs: ");
        for (int otp : otps) System.out.print(otp + " ");
        System.out.println("\nAll unique? " + areUnique(otps));
    }
}