package string.class_problems;

public class PalindromeChecker {

    public static boolean isPalindromeIterative(String text) {
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text) {
        if (text.length() <= 1) {
            return true;
        }
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }
        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    public static boolean isPalindromeArrayReversal(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        return new String(original).equals(new String(reversed));
    }

    private static String label(boolean isPalindrome) {
        return isPalindrome ? "Palindrome" : "Not Palindrome";
    }

    public static void main(String[] args) {
        String[] inputs = {"madam", "hello"};

        for (String input : inputs) {
            System.out.println("\"" + input + "\"");
            System.out.println("Iterative: " + label(isPalindromeIterative(input)) +
                    " | Recursive: " + label(isPalindromeRecursive(input)) +
                    " | Array Reversal: " + label(isPalindromeArrayReversal(input)));
            System.out.println();
        }
    }
}
