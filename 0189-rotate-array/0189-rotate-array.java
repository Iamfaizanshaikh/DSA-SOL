class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        int start = 0;
        int end = n - 1;
        
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        // Step 2: Reverse  k elements
        start = 0;
        end = k - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        // Step 3: Reverse remaining  elements
        start = k;
        end = n - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(nums));








        //Brute force technique
        // int last= nums.length-1;
        // for(int i=0; i<k; i++){
        //      int p=nums[last];

        //        for(int j=last; j>0; j--){
                
        //         nums[j]=nums[j-1];

        //         }
        //         nums[0]=p;

        // }

     
        
    }
}