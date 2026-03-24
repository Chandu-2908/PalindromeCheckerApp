import java.util.Scanner;

public class PalindromCheckerApp {

    // Method to check palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Normalize string: remove spaces & convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Check palindrome
        if (isPalindrome(normalized)) {
            System.out.println("It is a Palindrome (Ignoring case & spaces)");
        } else {
            System.out.println("It is NOT a Palindrome");
        }

        sc.close();
    }
}