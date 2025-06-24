class Solution {
    public void sortColors(int[] nums) {

        int zcount=0;
        int ocount=0;
        int tcount=0;

        int z=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                zcount++;
            }
             if(nums[i]==1){
                ocount++;
            }
             if(nums[i]==2){
                tcount++;
            }
        }

        for(int j=0; j<zcount; j++){
            nums[z]=0;
            z++;

        }
          for(int j=0; j<ocount; j++){
            nums[z]=1;
            z++;

        }
          for(int j=0; j<tcount; j++){
            nums[z]=2;
            z++;

        }



      






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