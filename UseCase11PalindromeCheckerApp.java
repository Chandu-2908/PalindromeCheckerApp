import java.util.*;


class PalindromeAlgorithms {


    public static boolean stackMethod(String input) {
        String str = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : str.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

  
    public static boolean dequeMethod(String input) {
        String str = input.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

   
    public static boolean twoPointerMethod(String input) {
        String str = input.replaceAll("\\s+", "").toLowerCase();
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
}

// Main class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Stack timing
        long start1 = System.nanoTime();
        boolean res1 = PalindromeAlgorithms.stackMethod(input);
        long end1 = System.nanoTime();

        // Deque timing
        long start2 = System.nanoTime();
        boolean res2 = PalindromeAlgorithms.dequeMethod(input);
        long end2 = System.nanoTime();

        // Two-pointer timing
        long start3 = System.nanoTime();
        boolean res3 = PalindromeAlgorithms.twoPointerMethod(input);
        long end3 = System.nanoTime();

        // Results
        System.out.println("\n--- Results ---");
        System.out.println("Stack Method: " + res1 + " | Time: " + (end1 - start1) + " ns");
        System.out.println("Deque Method: " + res2 + " | Time: " + (end2 - start2) + " ns");
        System.out.println("Two-Pointer Method: " + res3 + " | Time: " + (end3 - start3) + " ns");

        sc.close();
    }
}