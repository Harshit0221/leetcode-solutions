class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int count = 0;
        int blank = 0;

        for (char ch : moves.toCharArray()) {
            if (ch == 'L') {
                count--;
            } else if (ch == 'R') {
                count++;
            } else {
                blank++;
            }
        }

        return Math.abs(count) + blank;
    }
}