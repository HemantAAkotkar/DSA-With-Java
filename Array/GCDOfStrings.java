public class GCDOfStrings {

    public static String gcdOfStrings(String str1, String str2) {
        // If concatenations differ, no common pattern exists
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find gcd of lengths
        int gcdLength = gcd(str1.length(), str2.length());

        // Return substring of str1 with gcd length
        return str1.substring(0, gcdLength);
    }

    // Euclidean Algorithm for GCD
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));   // ABC
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));  // AB
        System.out.println(gcdOfStrings("LEET", "CODE"));    // ""
    }
}
 