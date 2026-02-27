import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromCheckerApp {
   public static void main(String[] args) {

        String original = "level";
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            stack.push(ch);      // LIFO
            queue.add(ch);       // FIFO
        }

        boolean isPalindrome = true;
        while (!stack.isEmpty()) {

            char fromStack = stack.pop();     // LIFO
            char fromQueue = queue.remove();  // FIFO

            if (fromStack != fromQueue) {
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
