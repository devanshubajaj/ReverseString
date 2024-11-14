import java.util.Scanner;

class StringReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String original = scanner.nextLine();

        String reversed = reverseString(original);

        System.out.println("Reversed String: " + reversed);

        // Check if the original string (ignoring case) is a palindrome
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("The original string is a palindrome.");
        } else {
            System.out.println("The original string is not a palindrome.");
        }

        scanner.close();
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
