class Solution {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public int minOperations(int[] nums) {
        int n = nums.length;
        // if any element is 1 -> return count of non-1
        int ones = 0;
        for (int x : nums) if (x == 1) ones++;
        if (ones > 0) return n - ones;

        // compute overall gcd
        int g = nums[0];
        for (int i = 1; i < n; i++) g = gcd(g, nums[i]);
        if (g != 1) return -1; // impossible

        // find shortest subarray with gcd = 1
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int cur = nums[i];
            if (cur == 1) { minLen = 1; break; }
            for (int j = i + 1; j < n; j++) {
                cur = gcd(cur, nums[j]);
                if (cur == 1) { minLen = Math.min(minLen, j - i + 1); break; }
            }
        }

        return minLen + n - 2;
    }
}
