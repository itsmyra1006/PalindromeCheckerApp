import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a string for UC6:");
        String input4 = scanner.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack2 = new Stack<>();

        for (int i = 0; i < input4.length(); i++) {
            char ch = input4.charAt(i);
            queue.add(ch);
            stack2.push(ch);
        }

        boolean isPal = true;

        while (!queue.isEmpty() && !stack2.isEmpty()) {

            if (queue.remove() != stack2.pop()) {
                isPal = false;
                break;
            }
        }

        if (isPal) {
            System.out.println(input4 + " is a Palindrome (UC6)");
        } else {
            System.out.println(input4 + " is Not a Palindrome (UC6)");
        }

        scanner.close();
    }
}