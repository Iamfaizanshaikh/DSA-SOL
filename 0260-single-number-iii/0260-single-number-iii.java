class Solution {
    public int[] singleNumber(int[] nums) {
        int ans=0;
        for(int num: nums){
            ans ^=num;
        }

        int bit= ans & -ans;
        int a=0  , b=0;

        for(  int num : nums){
            if((num & bit)==0){
                a ^=num;
            }
            else{
                b ^=num;
            }
        }

        return new int[]{a,b};
        
    }
}