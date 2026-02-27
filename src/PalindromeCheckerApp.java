import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a string for UC4:");
        String input2 = scanner.nextLine();

        char[] chars = input2.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(input2 + " is a Palindrome (UC4)");
        } else {
            System.out.println(input2 + " is Not a Palindrome (UC4)");
        }
        scanner.close();
    }
}