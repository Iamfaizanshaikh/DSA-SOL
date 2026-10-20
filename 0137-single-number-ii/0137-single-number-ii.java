class Solution {
    public int singleNumber(int[] nums) {

        int ones=0;
        int twos=0;

        for(int num: nums){

            ones= (ones^num) & ~twos;
            twos= (twos^num) & ~ones;
        }
        return ones;






        // Arrays.sort(nums);
        // int n= nums.length;
        // for(int i=1; i<nums.length; i+=3){
        //     if(nums[i]!=nums[i-1]){
        //         return nums[i-1];
        //     }
        // }
        // return nums[n-1];
    }
}