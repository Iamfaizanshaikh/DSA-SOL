class Solution {

    public boolean rotated(int[] num, int[] sort) {
        int k = num.length;
        if (k == 0) return true;

        int[] lps = new int[k];
        int len = 0;

        for (int i = 1; i < k; ) {
            if (sort[i] == sort[len]) {
                lps[i++] = ++len;
            } else if (len > 0) {
                len = lps[len - 1];
            } else {
                lps[i++] = 0;
            }
        }

        int i = 0;
        int j = 0;

        while (i < 2 * k - 1) {
            int current = num[i % k];

            if (current == sort[j]) {
                i++;
                j++;

                if (j == k) {
                    return true;
                }
            } else if (j > 0) {
                j = lps[j - 1];
            } else {
                i++;
            }
        }

        return false;
    }

    public int sortableIntegers(int[] nums) {
        int n = nums.length;

        int[] sorted = Arrays.copyOf(nums, n);
        Arrays.sort(sorted);

        int result = 0;

        for (int k = 1; k <= n; k++) {
            if (n % k != 0) continue;

            boolean valid = true;

            for (int start = 0; start < n; start += k) {
                int[] num = Arrays.copyOfRange(nums, start, start + k);
                int[] sort = Arrays.copyOfRange(sorted, start, start + k);

                if (!rotated(num, sort)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                result += k;
            }
        }

        return result;
    }
}