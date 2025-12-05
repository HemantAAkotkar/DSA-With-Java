// 🧩 Problem — LeetCode 1431: Kids With the Greatest Number of Candies
import java.util.*;

public class KidsWithCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Step 1: Find the maximum candies any kid has
        int maxCandy = 0;
        for (int candy : candies) {
            if (candy > maxCandy) {
                maxCandy = candy;
            }
        }

        // Step 2: Prepare result list
        List<Boolean> result = new ArrayList<>();

        // Step 3: Check if each kid can have greatest number after getting extraCandies
        for (int candy : candies) {
            if (candy + extraCandies >= maxCandy) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> result = kidsWithCandies(candies, extraCandies);

        System.out.println("Result: " + result);
    }
}
