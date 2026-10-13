class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] square = new long[nums.length];
        for (int k = 0; k < nums.length; k++) {
            square[k] = (long) nums[k] * nums[k];
        }

        Arrays.sort(square);
        long max = 0;
        int n = square.length;
        for (int i = 0; i < n; i++) {
            if (i < (n + 1) / 2) {
                max += square[n - 1 - i];
            } else {
                max -= square[n - 1 - i];
            }
        }

        return max;

    }
}