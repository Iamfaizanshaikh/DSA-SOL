class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=0;

        for(int i=0; i<nums.length; i++){
           max=Math.max(max,nums[i]);
           int min=Arrays.stream(nums,i,nums.length).min().getAsInt();

           if(max-min<=k){
            return i;
           }

        }
        return -1;
        
    }
}