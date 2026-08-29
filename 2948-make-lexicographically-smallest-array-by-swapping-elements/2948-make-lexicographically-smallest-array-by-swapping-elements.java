class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = ((long) nums[i] << 32) | i;
        }

        Arrays.sort(arr);

        int[] pos = new int[n];

        int start = 0;

        while (start < n) {
            int end = start + 1;

            while (end < n) {
                long a = arr[end - 1] >>> 32;
                long b = arr[end] >>> 32;

                if (b - a > limit) {
                    break;
                }

                end++;
            }

            for (int i = start; i < end; i++) {
                pos[i] = (int) arr[i];
            }

            Arrays.sort(pos, start, end);

            for (int i = start; i < end; i++) {
                nums[pos[i]] = (int) (arr[i] >>> 32);
            }

            start = end;
        }

        return nums;
    }
}