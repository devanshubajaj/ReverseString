import java.util.Scanner;

class StringReverser {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string to reverse: ");
            String original = scanner.nextLine();
            
            String reversed = reverseString(original);
            System.out.println("Reversed String: " + reversed);
            
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
