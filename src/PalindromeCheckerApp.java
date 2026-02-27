public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String hardcoded = "madam";
        String reverseHardcoded = "";

        for (int i = hardcoded.length() - 1; i >= 0; i--) {
            reverseHardcoded += hardcoded.charAt(i);
        }

        if (hardcoded.equals(reverseHardcoded)) {
            System.out.println(hardcoded + " is a Palindrome");
        } else {
            System.out.println(hardcoded + " is Not a Palindrome");
        }
    }
}