class Solution {
    public int removeDuplicates(int[] nums) {

    //     int k=1;

    // if(nums.length==0) return 0;

    // for(int i=0; i<nums.length-1; i++){
    //     if(nums[i]!=nums[i+1]){
    //         nums[k]=nums[i+1];
    //         k++;
    //     }
    // }

    //     return k;

    // }

        if (nums.length == 0)
            return 0;
        int n = 1;
        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[n - 1]) {
                nums[n] = nums[j];

                n++;
            }
        }

        return n;

    }
}