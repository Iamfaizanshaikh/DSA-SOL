class Solution {
    public int singleNumber(int[] nums) {


        int result=0;

        for(int num:nums){

            result ^=num;
        }
        return result;

























        
        // int sum=0;

        // for(int i=0; i<nums.length-1; i++){


        //     for(int j=i+1; j<nums.length; j++){

        //         if(nums[i]==nums[j]){
        //             nums[i]=0;
        //             nums[j]=0;
                    
        //         }
        //     }
            
        // }
        // for(int i=0; i<nums.length; i++){
        //    sum+=nums[i];
        // }

        // return sum;
        
    }
}