class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix= new int[nums.length];
        prefix[0]=nums[0];
        int sum=prefix[0];
        for(int i=1; i<nums.length;  i++){
            prefix[i]=sum+nums[i];
            sum=prefix[i];
        }
        int len=nums.length-1;
        if(prefix[len]-prefix[0]==0) return 0;
        
        for(int i=1; i<nums.length; i++){
            if(prefix[i-1]==prefix[len]-prefix[i]) return i;
        } 

        return -1;
        
    }
}