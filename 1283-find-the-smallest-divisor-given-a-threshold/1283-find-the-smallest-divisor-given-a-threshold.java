class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int max=0;
        for(int num: nums){
            max=Math.max(max,num);
        }

        int left=1;
        int right=max;
        while(left<right){
            int mid=left+(right-left)/2;
            int sum=0;
            for(int i=0; i<nums.length; i++){
                sum+=(nums[i]+mid-1)/mid;
                
            }
            if(sum>threshold){
                left=mid+1;
            }else{
                right=mid;
            }

        }

        return left;


























        //Brute force
        // int max=0;
        // for(int num: nums){
        //     max=Math.max(max,num);
        // }  
        // for(int i=1; i<=max; i++){
        //     int sum=0;
        //     for(int j=0; j<nums.length; j++){

        //         sum+=(nums[j]+i-1)/i;
                

        //     }
        //     if(sum<=threshold){
        //         return i;
        //     }
            
        // }
        // return 0;
        
    }
}