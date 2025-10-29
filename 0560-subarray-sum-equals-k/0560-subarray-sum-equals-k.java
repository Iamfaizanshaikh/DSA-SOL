class Solution {
    public int subarraySum(int[] nums, int k) {

        // int count = 0;
        // int sum = 0;

        // Map<Integer, Integer> map = new HashMap<>();
        // map.put(0, 1);  // important: to handle case when subarray itself starts from index 0

        // for (int num : nums) {
        //     sum += num;

        //     // Check if (sum - k) happened before
        //     if (map.containsKey(sum - k)) {
        //         count += map.get(sum - k);
        //     }

        //     // Update map: how many times this sum has occurred
        //     map.put(sum, map.getOrDefault(sum, 0) + 1);
        // }

        // return count;









        






























        
        int count=0;

        for(int i=0; i<nums.length; i++){
            int sum=0;

               for(int j=i; j<nums.length; j++){

                sum+=nums[j];
              
                if(sum==k){    
                   count++;  
                }
                
            }

        }
        return count;
        
    }
}