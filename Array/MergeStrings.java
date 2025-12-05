/* 1768. Merge Strings Alternately
🧩 Problem

Given two strings word1 and word2, merge them by alternating characters.
If one string is longer, append the remaining characters at the end.

Example

Input:
word1 = "abc", word2 = "pqr"
Output:
"apbqcr"  */
// File: MergeStrings.java
public class MergeStrings {

    /**
     * Merge two strings alternately starting with word1.
     * Example: word1="abc", word2="pqr" -> "apbqcr"
     *
     * Time: O(n + m), Space: O(n + m)
     */
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        int i = 0, j = 0;
        // Append alternating characters while both strings have chars
        while (i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));
        }

        // Append any remaining substring from word1 or word2
        if (i < word1.length()) {
            result.append(word1.substring(i));
        }
        if (j < word2.length()) {
            result.append(word2.substring(j));
        }

        // Return the final merged string (important!)
        return result.toString();
    }

    // Simple driver to test the method
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));      // apbqcr
        System.out.println(mergeAlternately("ab", "pqrs"));     // apbqrs
        System.out.println(mergeAlternately("abcd", "pq"));     // apbqcd
        System.out.println(mergeAlternately("", "xyz"));        // xyz
        System.out.println(mergeAlternately("hello", ""));      // hello
    }
}
