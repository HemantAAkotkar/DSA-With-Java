// 🧩 Problem — LeetCode 345: Reverse Vowels of a String

public class ReverseVowels {

    // Helper function to check if a character is a vowel
    private static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            // Move left pointer until it finds a vowel
            while (left < right && !isVowel(chars[left])) {
                left++;
            }

            // Move right pointer until it finds a vowel
            while (left < right && !isVowel(chars[right])) {
                right--;
            }

            // Swap vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String input1 = "hello";
        System.out.println("Input: " + input1 + " → Output: " + reverseVowels(input1));

        String input2 = "leetcode";
        System.out.println("Input: " + input2 + " → Output: " + reverseVowels(input2));

        String input3 = "KrishiUnnati";
        System.out.println("Input: " + input3 + " → Output: " + reverseVowels(input3));
    }
}
