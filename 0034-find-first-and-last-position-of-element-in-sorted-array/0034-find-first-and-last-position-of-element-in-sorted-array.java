class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first=-1;
        int last=-1;
       
        int[] result={-1,-1};

        for(int i=0; i<nums.length; i++){

            if(nums[i]==target){

                if(result[0]==-1){
                    result[0]=i;
                }
               
                    result[1]=i;
                
                

            }
           

        }

        return result; 




















        // if(nums.length==0){
        //     return new int[]{-1,-1};
        // }
        // if(nuns[0])

        // int high=nums.length-1;
        // int low=0;
        // int x=0;

        // while(low<=high){

        //     int mid=low+(high-low)/2;

        //     if(nums[mid]>=target){
        //         high=mid-1;
        //     }
        //     else{
        //         low=mid+1;
        //     }
            

        // }
        // int low1=0;
        // int high1=nums.length-1;
        // int UpperB=0;

        // while(low1<=high1){
        //   int  mid=low1+(high1-low1)/2;


        //     if(nums[mid]>target){
        //         UpperB=mid;
        //         high1=mid-1;
        //     }

        //     else{
        //         low1=mid+1;
        //     }
        // }

        // if(low==1||UpperB==nums.length){
        //     return new int[]{-1,-1};
        // }
        







        // return new int[]{low,UpperB-1};

        
    }
}