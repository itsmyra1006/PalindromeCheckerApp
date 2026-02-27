import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter a string:");
        String input1 = scanner.nextLine();

        String reverse1 = "";

        for (int i = input1.length() - 1; i >= 0; i--) {
            reverse1 += input1.charAt(i);
        }

        if (input1.equals(reverse1)) {
            System.out.println(input1 + " is a Palindrome (UC3)");
        } else {
            System.out.println(input1 + " is Not a Palindrome (UC3)");
        }
        scanner.close();
    }
}