class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n= nums.length;

        int[] arr= new int[n];
        

        for(int i=0; i<n; i++){
            boolean found= false;

            for(int step=1; step<n; step++){

                int j= (i+step)%n;

                if(nums[j]>nums[i]){
                    arr[i]=nums[j];
                    found= true;
                    break;
                }


            }
            if(!found){
                arr[i]= -1;
            }
            
        }


        return arr;
        
    }
}