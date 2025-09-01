import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort by start times
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        // Start with first interval
        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            // If current end >= next start → merge
            if (current[1] >= intervals[i][0]) {
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                // No overlap → add current to result
                result.add(current);
                current = intervals[i];  // move to next interval
            }
        }

        // Add the last interval
        result.add(current);

        return result.toArray(new int[result.size()][]);
    }
}
