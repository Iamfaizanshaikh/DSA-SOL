class Solution {
    public int minMoves(int[] nums) {
        
        int n= nums.length;

        int sum=0;



        int min= Integer.MAX_VALUE;
        for(int num: nums){
            min=Math.min(min,num);
            sum+=num;
        }

        
        return  (sum-min)-(n-1)*min;
    }
}