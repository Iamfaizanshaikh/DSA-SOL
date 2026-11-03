class Solution {
    public int minMoves(int[] nums) {

        
        int max= nums[0];
        int n= nums.length;
        int move=0;

        for(int num : nums){

            if(num>max){
                max= num;
            }
            
        }
        for(int num: nums){
            move+=Math.abs(max-num);
        }

        return move;
        
    }
}