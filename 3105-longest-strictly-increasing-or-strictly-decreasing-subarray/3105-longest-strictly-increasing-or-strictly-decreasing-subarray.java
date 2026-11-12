class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int len=1;
        int maxlen=1;
        
        int declen=1;
        int maxdeclen=1;
        

        for(int i=1; i<nums.length; i++){
            //Decreasing
            if(nums[i]<nums[i-1]){
                declen++;
                maxdeclen=Math.max(maxdeclen,declen);
            }else{
                declen=1;
            }
            //increasing
            if(nums[i]>nums[i-1]){
                len++;
                maxlen=Math.max(maxlen,len);
            }
            else{
                len=1;
                
            }
           
          
        }


        return Math.max(maxlen,maxdeclen);

        
    }
}