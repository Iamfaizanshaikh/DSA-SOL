class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int total=0;
        int left=0;
        int odd=0;
        int len=nums.length;
        for(int right=0; right<nums.length; right++){
            if(nums[right]%2!=0){
                odd++;
            }
            while(odd>k){
                if(nums[left]%2!=0){ 
                    odd--;
                    }

                left++;
            }
            if(odd==k){
                int temp=left;
                while(temp<=right && nums[temp]%2==0){
                    temp++;
                }
                total+=temp-left+1;
            } 
         
        }
        
        return total;
    }
}