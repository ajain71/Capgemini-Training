
import java.util.HashSet;
import java.util.Random;

public class OTPGenerator {
    public static void main(String[] args) {
        int[] otps = new int[10];
        
        // Generate 10 unique OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }
        
        // Display generated OTPs
        System.out.print("Generated OTPs: ");
        for (int otp : otps) {
            System.out.print(otp + " ");
        }
        System.out.println();
        
        // Check uniqueness
        boolean areUnique = areOTPsUnique(otps);
        System.out.println("Are OTPs unique? " + areUnique);
    }
    
    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }
    
    // Method to check if all OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            otpSet.add(otp);
        }
        return otpSet.size() == otps.length;
    }
}

