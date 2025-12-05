import java.util.HashMap;

class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int operations = 0;

        for (int num : nums) {
            int complement = k - num;

            // If complement exists, form a pair
            if (map.getOrDefault(complement, 0) > 0) {
                operations++;
                map.put(complement, map.get(complement) - 1);
            } else {
                // Store this number for future use
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return operations;
    }
}