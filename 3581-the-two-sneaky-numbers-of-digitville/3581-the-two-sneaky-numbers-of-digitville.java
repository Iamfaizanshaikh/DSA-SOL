class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr= new int[2];
        int k=0;
        

        for(int i=0; i<=nums.length-2; i++){

            for(int j=i+1; j<=nums.length-1; j++){

                if(nums[i]==nums[j]){
                    arr[k] +=nums[i];
                    k++;

                }
                if(k==2){
                    break;
                }

            }
        }
        return arr;
        
    }
}