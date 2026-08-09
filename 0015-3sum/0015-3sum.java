class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        

        
        
        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;

            int left=i+1;
            int right=nums.length-1;

        while(left<right){
            int sum = nums[i] + nums[left] + nums[right];
            if(sum==0){
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                // list.add(nums[i]);
                // list.add(nums[left]);
                // list.add(nums[right]);
                // result.add(new ArrayList<>(list));
                // list.clear(); 
                left++;
                right--;
                while(left<right && nums[left]==nums[left-1]) left++;
                while(left<right && nums[right]==nums[right+1]) right--;
            }
            else if(sum>0){
                right--;
            }
            else{
                left++;
            }
        }

        }
         




    






        // List<List<Integer>> result = new ArrayList<>();
        // if (nums == null || nums.length < 3) return result;

        // Arrays.sort(nums);
        // int n = nums.length;

        // for (int i = 0; i < n - 2; i++) {
        //     // skip duplicate first elements
        //     if (i > 0 && nums[i] == nums[i - 1]) continue;

        //     int left = i + 1;
        //     int right = n - 1;

        //     while (left < right) {
        //         int sum = nums[i] + nums[left] + nums[right];

        //         if (sum == 0) {
        //             result.add(Arrays.asList(nums[i], nums[left], nums[right]));

        //             // move left and right and skip duplicates
        //             left++;
        //             right--;
        //             while (left < right && nums[left] == nums[left - 1]) left++;
        //             while (left < right && nums[right] == nums[right + 1]) right--;
        //         } else if (sum < 0) {
        //             left++;
        //         } else {
        //             right--;
        //         }
        //     }
        // }

        return result;
    }
}
