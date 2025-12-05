import java.util.Arrays;
import java.util.Collections;

public class ReverseWords{
    public static String reverseWords( String s){
        // Step 1: Trim leading/trailing spaces
        s = s.trim();
        
        // Step 2: Split by one or more spaces (regex handles multiple spaces)
        String[] words = s.split("\\s+");
        
        // Step 3: Reverse the array
        Collections.reverse(Arrays.asList(words));
        
        // Step 4: Join back into a single string
        return String.join(" ", words);
    }
    public static void main(String[] args) {
        String input1 = "  the sky  is blue  ";
        String input2 = "hello world";
        String input3 = "  a good   example  ";

        System.out.println("Input: \"" + input1 + "\"");
        System.out.println("Output: \"" + reverseWords(input1) + "\"");
        System.out.println();

        System.out.println("Input: \"" + input2 + "\"");
        System.out.println("Output: \"" + reverseWords(input2) + "\"");
        System.out.println();

        System.out.println("Input: \"" + input3 + "\"");
        System.out.println("Output: \"" + reverseWords(input3) + "\"");
    }
}