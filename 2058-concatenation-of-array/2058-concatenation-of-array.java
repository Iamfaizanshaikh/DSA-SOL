class Solution {
    public int[] getConcatenation(int[] nums) {
        int k=0;
        int[] ans = new int[2*nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i]=nums[i];
        }
        for(int j=nums.length; j<ans.length; j++){
           
            ans[j]=nums[k];
            k++;

        }
        
        return ans;
    }
    
}