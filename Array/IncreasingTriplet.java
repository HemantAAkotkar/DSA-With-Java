public class IncreasingTriplet {

    // ✅ Solution Method
    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n <= first) {
                first = n;           // smallest so far
            } else if (n <= second) {
                second = n;          // next bigger number
            } else {
                // found a number greater than both first and second
                return true;
            }
        }
        return false;
    }

    // ✅ Main method for local testing (VS Code)
    public static void main(String[] args) {

        // Example 1
        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println("Example 1: " + increasingTriplet(nums1)); 
        // Expected: true (1 < 2 < 3)

        // Example 2
        int[] nums2 = {5, 4, 3, 2, 1};
        System.out.println("Example 2: " + increasingTriplet(nums2)); 
        // Expected: false

        // Example 3
        int[] nums3 = {2, 1, 5, 0, 4, 6};
        System.out.println("Example 3: " + increasingTriplet(nums3)); 
        // Expected: true (1 < 4 < 6)
    }
}
