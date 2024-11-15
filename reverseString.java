import java.util.Scanner;

class StringReverser {
    public static void main(String[] args) {
        try ( // Geta user input
                var scanner = new Scanner(System.in)) {
            System.out.print("Enter a string to reverse: ");
            String original = scanner.nextLine();
            
            String reversed = reverseString(original);
            System.out.println("Reversed String: " + reversed);
        }
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
