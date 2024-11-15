import java.util.Scanner;

class StringReverser {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            System.out.print("Enter a string to reverse: ");
            String original = scanner.nextLine();
            
            // Convert to lowercase to ignore case sensitivity
            String reversed = reverseString(original.toLowerCase());
            
            System.out.println("Reversed String (case insensitive): " + reversed);
        }
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
