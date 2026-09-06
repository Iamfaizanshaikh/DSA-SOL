class Solution {
    public int majorityElement(int[] nums) {


 

      
       int me=0;
       int vote=0;
       for(int i=0; i<nums.length; i++){
        if(vote==0){
            me=nums[i];
        }
        else if(me==nums[i]){
            vote++;
        }
        else{
            vote--;
        }
       }
        
            // for(int i=0; i<n; i++){
            //     int count=0;
            //     for(int j=0; j<n; j++){

            //           if(nums[i]==nums[j]){
            //             count++;    
            //     }
            //     }

              
            //   if(count>(n/2)){
                
            //     return nums[i];
            //   }
            // }
        
       
        return me;
    
    }
}