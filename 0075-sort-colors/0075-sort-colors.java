class Solution {
    public void sortColors(int[] nums) {

        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid<=high){
            if(nums[mid]==2){
                nums[mid]=nums[high];
                nums[high]=2;
                high--;
            }

            else if(nums[mid]==0){
                nums[mid]=nums[low];
                nums[low]=0;
                low++;
                mid++;
            }
            else{
                mid++;
            }
          
        


        }






















        // int left=0;
        // int right=nums.length-1;

        // while(left<=right){
        //     if(nums[left]>nums[right]){
        //         int temp=nums[left];
        //         nums[left]=nums[right];
        //         nums[right]=temp;
        //         left++;
        //         right--;
                
        //     }
        //     else{
        //         left++;
        //         right--;
        //     }
       
        // }






        
    

        // int low=0;
        // int mid=0;
        // int high=nums.length-1;
        // while(mid<=high){

        //     if (nums[mid] == 0) {

        //         int temp=nums[mid];
        //         nums[mid]=nums[low];
        //         nums[low]=temp;

                
        //         low++;
        //         mid++;
        //         }

        //     else if (nums[mid] == 1) {
        //         mid++;
        //         }

        //     else  {

        //         int temp= nums[mid];
        //         nums[mid]=nums[high];
        //         nums[high]=temp;
        //         high--;
            
            
            
            
        //     }



        // }

        //   for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == 0) zcount++;
        //     else if (nums[i] == 1) ocount++;
        //     else if (nums[i] == 2) tcount++;
        // }

        // int z = 0;
        // for (int j = 0; j < zcount; j++) nums[z++] = 0;
        // for (int j = 0; j < ocount; j++) nums[z++] = 1;
        // for (int j = 0; j < tcount; j++) nums[z++] = 2;




        // for(int i=0; i<nums.length-1; i++){

        //     for(int j=i+1; j<nums.length; j++){

        //         if(nums[i]>nums[j]){
        //             int temp=nums[i];
        //             nums[i]=nums[j];
        //             nums[j]=temp;
                    

        //         }


        //     }
        // }

        System.out.println(Arrays.toString(nums));
        
    }
}