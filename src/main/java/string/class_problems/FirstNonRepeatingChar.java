package string.class_problems;

public class FirstNonRepeatingChar {

    public static char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String[] inputs = {"swiss", "aabbcc"};

        for (String input : inputs) {
            char result = findFirstNonRepeatingChar(input);
            if (result == '\0') {
                System.out.println("\"" + input + "\" -> No Non-Repeating Character Found");
            } else {
                System.out.println("\"" + input + "\" -> First Non-Repeating Character: '" + result + "'");
            }
        }
    }
}
