import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a string for UC5:");
        String input3 = scanner.nextLine();

        Stack<Character> stack1 = new Stack<>();

        for (int i = 0; i < input3.length(); i++) {
            stack1.push(input3.charAt(i));
        }

        String reversed = "";

        while (!stack1.isEmpty()) {
            reversed += stack1.pop();
        }

        if (input3.equals(reversed)) {
            System.out.println(input3 + " is a Palindrome (UC5)");
        } else {
            System.out.println(input3 + " is Not a Palindrome (UC5)");
        }

        scanner.close();
    }
}