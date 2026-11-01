class Solution {
    public long subArrayRanges(int[] nums) {

        int n = nums.length;
        long sum = 0;

        for (int i = 0; i < n; i++) {

            long largest = nums[i];
            long smallest = nums[i];

            for (int j = i; j < n; j++) {

                if (nums[j] > largest) {
                    largest = nums[j];
                }
                if (nums[j] < smallest) {
                    smallest = nums[j];
                }
                sum += largest - smallest;

            }
        }

        return sum;

    }
}