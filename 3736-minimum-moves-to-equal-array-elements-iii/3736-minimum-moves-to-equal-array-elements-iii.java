class Solution {
    public int minMoves(int[] nums) {

        
        int max= nums[0];
        int n= nums.length;
        int move=0;
        int sum=0;

        for(int num : nums){

            if(num>max){
                max= num;
            }
            sum+=num;
            
        }
        // for(int num: nums){
        //     move+=Math.abs(max-num);
        // }

        return (n*max)-sum;
        
    }
}