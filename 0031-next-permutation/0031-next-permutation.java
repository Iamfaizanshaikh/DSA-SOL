class Solution {
    public void nextPermutation(int[] nums) {
     int n=nums.length;
    int pivot=-1;
     for(int j=n-1;j>0;j--){
        if(nums[j]>nums[j-1]){
            pivot=j-1;
            break;
        }
     }
     int temp=0;
    if(pivot>=0){
         for(int i=pivot+1;i<n;i++){
        if( nums[i]>nums[pivot]){
            temp=i;
        }
     }
          swap(nums,pivot,temp);

    }
    // swap(nums,pivot,temp);
     reverse(nums,pivot+1,n-1);
        
    }
    static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    static void reverse (int[] nums,int i ,int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}