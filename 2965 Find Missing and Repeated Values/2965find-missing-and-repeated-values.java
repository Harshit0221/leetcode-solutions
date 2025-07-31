import java.util.*;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = grid.length;
        int actualSum = 0, expectedSum = 0;
        int repeated = -1, missing = -1;

        // Count frequencies and calculate actual sum
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int val = grid[i][j];
                actualSum += val;

                if (mp.containsKey(val)) {
                    mp.put(val, mp.get(val) + 1);
                } else {
                    mp.put(val, 1);
                }
            }
        }

        // Expected sum of numbers from 1 to 9 (for 3x3 matrix)
        int total = n * n;
        expectedSum = (total * (total + 1)) / 2;

        // Find missing and repeated values without using getOrDefault
        for (int i = 1; i <= total; i++) {
            Integer count = mp.get(i);
            if (count == null) {
                missing = i;
            } else if (count == 2) {
                repeated = i;
            }
        }

        return new int[]{repeated, missing};
    }
}
