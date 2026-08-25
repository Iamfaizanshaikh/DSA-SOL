class Solution {
    public int pivotIndex(int[] nums) {


        int total=0;
        for(int num: nums){
            total+=nums[num];
        }
        int leftsum=0;

        for(int i=0; i<nums.length; i++){
            int rightsum=total-leftsum-nums[i];
            if(leftsum==rightsum) return i;
            leftsum+=nums[i];
        }



        // int[] prefix= new int[nums.length];
        // prefix[0]=nums[0];
        // for(int i=1; i<nums.length;  i++){
        //     prefix[i]=prefix[i-1]+nums[i];
        // }
        // int len=nums.length-1;
        // if(prefix[len]-prefix[0]==0) return 0;
        
        // for(int i=1; i<nums.length; i++){
        //     if(prefix[i-1]==prefix[len]-prefix[i]) return i;
        // } 

        return -1;
        
    }
}