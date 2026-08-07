class Solution {
    public int[] sortedSquares(int[] nums) {

      
        for(int m=0; m<nums.length; m++){
            
            nums[m]=(nums[m]*nums[m]);
            
           
        }

        int i=0;
        int j=nums.length-1;
        int k=nums.length-1;
        int[] ans = new int[nums.length];


        while(k>=0){
            if(nums[i]>=nums[j]){
                ans[k]=nums[i];
                i++;
                
            }
            else if(nums[j]>=nums[i]){
                ans[k]=nums[j];
                j--;
            }

        k--;
        

        }


      

        // Arrays.sort(nums);
        return ans;
        
    }
}