public class Main {
    public static void main(String[] args) {
        // Check if numbers are prime
        int[] testNumbers = {3, 17, 22, 23, 100};
        for (int num : testNumbers) {
            System.out.println(num + " is a prime number: " + NumberStringUtils.isPrime(num));
        }

        // Test for Palindrome
        String[] testStrings = {
            "mom",
            "No lemon, no melon",
            "kambi",
            null
        };
        
        for (String str :  testStrings) {
            System.out.println("\"" + str + "\" is a palindrome: " + NumberStringUtils.isPalindrome(str));
        }
    }
}
