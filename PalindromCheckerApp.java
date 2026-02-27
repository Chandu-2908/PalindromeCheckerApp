import java.util.Stack;

public class PalindromCheckerApp {
   public static void main(String[] args) {

      
        String original = "madam";

   
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        boolean isPalindrome = true;

      
        for (int i = 0; i < original.length(); i++) {
            char poppedChar = stack.pop();

            if (original.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        
        if (isPalindrome) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}
