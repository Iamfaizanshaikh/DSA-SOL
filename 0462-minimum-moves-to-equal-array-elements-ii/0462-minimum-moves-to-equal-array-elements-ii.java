class Solution {
    public int minMoves2(int[] nums) {

       
        Arrays.sort(nums);
        int move=0;
        int median=nums[nums.length/2];

        for(int num : nums){
            move+=Math.abs(num-median);

           
        }

        return move;

      
        
    }
}