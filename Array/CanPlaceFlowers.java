// 🧩 Problem — LeetCode 605: Can Place Flowers

public class CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                // Check left and right plots
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == len - 1) || (flowerbed[i + 1] == 0);

                if (emptyLeft && emptyRight) {
                    // Plant a flower here
                    flowerbed[i] = 1;
                    n--;

                    if (n == 0) {
                        return true; // planted all required flowers
                    }
                }
            }
        }

        return n <= 0;
    }

    public static void main(String[] args) {
        int[] flowerbed1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        System.out.println("Can place " + n1 + " flowers? " + canPlaceFlowers(flowerbed1, n1));

        int[] flowerbed2 = {1, 0, 0, 0, 1};
        int n2 = 2;
        System.out.println("Can place " + n2 + " flowers? " + canPlaceFlowers(flowerbed2, n2));
    }
}
