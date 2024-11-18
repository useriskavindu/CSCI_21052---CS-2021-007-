import java.util.StringTokenizer;

public class Q5 {

    public static boolean isPalindrome(String sentence) {
        // Remove punctuation and convert to lowercase
        StringBuilder cleanedSentence = new StringBuilder();
        StringTokenizer tokenizer = new StringTokenizer(sentence, " ,.!?;:");

        while (tokenizer.hasMoreTokens()) {
            cleanedSentence.append(tokenizer.nextToken().toLowerCase());
        }

        // Check if the cleaned sentence is a palindrome
        String forward = cleanedSentence.toString();
        String backward = cleanedSentence.reverse().toString();

        return forward.equals(backward);
    }

    public static void main(String[] args) {
        // Example sentences to test
        String sentence1 = "A man, a plan, a canal, Panama!";
        String sentence2 = "Hello, World!";

        System.out.println("\"" + sentence1 + "\" is a palindrome: " + isPalindrome(sentence1));
        System.out.println("\"" + sentence2 + "\" is a palindrome: " + isPalindrome(sentence2));
    }
}
