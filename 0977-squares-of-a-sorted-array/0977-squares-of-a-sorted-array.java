class Solution {
    public int[] sortedSquares(int[] nums) {

      
        // for(int m=0; m<nums.length; m++){
            
        //     nums[m]=(nums[m]*nums[m]);
                
        // }

        int i=0;
        int j=nums.length-1;
        int k=nums.length-1;
        int[] ans = new int[nums.length];


        while(k>=0){
            int num1=Math.abs(nums[i]);
            int num2=Math.abs(nums[j]);
            if(num1>=num2){
                ans[k]=num1*num1;
                i++;
                
            }
            else if(num2>=num1){
                ans[k]=num2*num2;
                j--;
            }

        k--;
        

        }


        return ans;
        
    }
}