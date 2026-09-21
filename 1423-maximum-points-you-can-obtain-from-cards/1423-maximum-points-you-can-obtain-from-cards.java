class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;

        // Same-length prefix array
        int[] prefixsum = new int[n];

        prefixsum[0] = cardPoints[0];

        for (int i = 1; i < n; i++) {
            prefixsum[i] = prefixsum[i - 1] + cardPoints[i];
        }

        int max = 0;

        for (int left = 0; left <= k; left++) {

            int right = k - left;
            int sum = 0;

            // LEFT
            if (left > 0) {
                sum += prefixsum[left - 1];
            }

            // RIGHT
            if (right > 0) {

                int start = n - right;

                if (start == 0) {
                    sum += prefixsum[n - 1];
                } else {
                    sum += prefixsum[n - 1] - prefixsum[start - 1];
                }
            }

            max = Math.max(max, sum);
        }

        return max;
    }
}