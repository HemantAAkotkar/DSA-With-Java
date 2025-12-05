class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0; // Pointer for s
        int j = 0; // Pointer for t

        // Traverse both strings
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; // Move in s if match found
            }
            j++; // Always move in t
        }

        // If we've gone through entire s, it's a subsequence
        return i == s.length();
    }
}