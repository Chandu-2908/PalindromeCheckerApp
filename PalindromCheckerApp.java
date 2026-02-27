public class PalindromCheckerApp {
   public static void main(String[] args) {

        String original = "radar"; 
        char[] characters = original.toCharArray();

        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}
