class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int[] runningSum= new int[nums.length];
        for(int i=0; i<nums.length; i++){

            runningSum[i]=nums[i]+sum;
            sum +=nums[i];
        }
        return runningSum;
}
    }
    