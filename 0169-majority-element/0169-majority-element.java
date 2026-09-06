class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map= new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
            if(map.get(num)>nums.length/2)
            return num;
        }
        // for(int key:map.keySet()){
        //     if(map.get(key)>nums.length/2)
        //     return key;
        // }




 

      
    //    int me=0;
    //    int vote=0;
    //    for(int i=0; i<nums.length; i++){
    //     if(vote==0){
    //         me=nums[i];
    //     }
    //     if(me==nums[i]){
    //         vote++;
    //     }
    //     else{
    //         vote--;
    //     }
    //    }
        
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
        
       return -1;
    
    }
}