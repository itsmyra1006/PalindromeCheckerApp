import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a string for UC7:");
        String input5 = scanner.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < input5.length(); i++) {
            deque.addLast(input5.charAt(i));
        }

        boolean isDequePal = true;

        // Remove first & last and compare
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isDequePal = false;
                break;
            }
        }

        if (isDequePal) {
            System.out.println(input5 + " is a Palindrome (UC7)");
        } else {
            System.out.println(input5 + " is Not a Palindrome (UC7)");
        }

        scanner.close();
    }
}