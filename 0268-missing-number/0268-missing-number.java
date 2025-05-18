class Solution {
    public int missingNumber(int[] nums) {

        int tsum= (nums.length*(nums.length+1))/2;
        int sum=0;
        for(int num: nums){
            sum+=num;

        }
        return tsum-sum;

















         
        // for(int i = 0; i <= nums.length; i++) {
        //     boolean found = false;

        //     for(int j = 0; j < nums.length; j++) {
        //         if(nums[j] == i) { 
        //             found = true;
        //             break;  
        //         }
        //     }

        //     if(!found)
        //         return i;
        // }

        // return -1;
    }
}

       
        
      

        
    
    
