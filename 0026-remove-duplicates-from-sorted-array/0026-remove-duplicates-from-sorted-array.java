class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0)
            return 0;
        int n = 1;
        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[n - 1]) {
                nums[n] = nums[j];

                n++;
            }
        }

        return n;

    }
}