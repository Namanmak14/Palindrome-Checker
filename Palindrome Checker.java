import java.util.Scanner;

public class PalindromeChecker {

    /**
     * Checks if a given integer is a palindrome.
     * 
     * @param number The integer to evaluate.
     * @return true if the integer is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(int number) {
        // Negative numbers are not palindromes because the '-' sign 
        // does not appear at the end when reversed (e.g., -121 becomes 121-).
        if (number < 0) {
            return false;
        }

        int originalNumber = number;
        int reversedNumber = 0;

        // Extract digits one by one and build the reversed number
        while (number > 0) {
            int lastDigit = number % 10;                     // Extract the last digit
            reversedNumber = (reversedNumber * 10) + lastDigit; // Shift left and append digit
            number /= 10;                                    // Remove the last digit
        }

        // Compare the original input with the mathematically reversed value
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        // Requirement 1: Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to check if it's a palindrome: ");
        
        if (scanner.hasNextInt()) {
            int userInput = scanner.nextInt();

            // Requirement 2 & 3: Check palindrome and display output
            if (isPalindrome(userInput)) {
                System.out.println("Result: " + userInput + " IS a palindrome.");
            } else {
                System.out.println("Result: " + userInput + " IS NOT a palindrome.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        scanner.close();

        // Requirement 5: Test cases (including edge cases)
        runTestCases();
    }

    /**
     * Requirement 5: Executes 5 test cases, including edge cases.
     */
    private static void runTestCases() {
        System.out.println("\n--- Running Test Cases ---");
        
        int[] testCases = {
            121,    // Test Case 1: Standard positive palindrome
            -121,   // Test Case 2: Edge Case - Negative number
            0,      // Test Case 3: Edge Case - Single digit zero
            123,    // Test Case 4: Non-palindrome positive number
            10      // Test Case 5: Edge Case - Multi-digit ending with 0 (reverses to 1)
        };

        for (int i = 0; i < testCases.length; i++) {
            int testVal = testCases[i];
            boolean result = isPalindrome(testVal);
            System.out.printf("Test Case %d: Input = %-5d | Is Palindrome? %s%n", 
                              (i + 1), testVal, result);
        }
    }
}