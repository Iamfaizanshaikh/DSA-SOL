class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int sum=0;

        int left=0;
        int right=1;
        while(left<=n){
            if(n%right==0){
                sum+=nums[left]*nums[left];
            }
            right++;
            left++;
        }
        
        return sum;
    }
}