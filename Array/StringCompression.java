public class StringCompression {

    // ✅ Core Solution
    public static int compress(char[] chars) {
        int write = 0;
        int i = 0;

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count consecutive repeating characters
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Write the character
            chars[write++] = currentChar;

            // If count > 1, write each digit of the count
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }

    // ✅ For testing locally in VS Code
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newLength = compress(chars);

        System.out.println("Compressed Length: " + newLength);
        System.out.print("Compressed Array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }
}
