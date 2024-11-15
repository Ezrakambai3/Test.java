public class TestUtils {
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        
        // Convert to lowercase
        String processedStr = str.replaceAll("\\s+", "").toLowerCase();
        int right = 0;
        int left = processedStr.length() - 1;
        
        while (right < left) {
            if (processedStr.charAt(right) != processedStr.charAt(left)) {
                return false;
            }
            right++;
            left--;
        }
        return true;
    }
}



