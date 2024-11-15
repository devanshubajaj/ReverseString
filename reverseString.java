import java.util.Scanner;

class StringReverser {
    public static void main(String[] args) {
        // Get user input
        try (var scanner = new Scanner(System.in)) {
            System.out.print("Enter a string to reverse: ");
            String original = scanner.nextLine();

            // Choose case sensitivity option
            System.out.print("Do you want the reversal to be case insensitive? (yes/no): ");
            String choice = scanner.nextLine().trim().toLowerCase();
            
            // Process string based on case-sensitivity choice for reversal
            String processedString = choice.equals("yes") ? original.toLowerCase() : original;
            String reversed = reverseString(processedString);
            
            System.out.println("Reversed String: " + reversed);
            
            // Check if the original string is a palindrome, ignoring case
            if (original.equalsIgnoreCase(reversed)) {
                System.out.println("The original string is a palindrome.");
            } else {
                System.out.println("The original string is not a palindrome.");
            }
            
            // Count the number of vowels in the reversed string
            int vowelCount = countVowels(reversed);
            System.out.println("Number of vowels in the reversed string: " + vowelCount);
        }
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    // Method to count vowels in a string
    public static int countVowels(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) { // Convert to lowercase for case-insensitive counting
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    // Helper method to check if a character is a vowel
    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
