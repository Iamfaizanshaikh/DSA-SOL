class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int first=-1;
        int last=-1;

        while(low<=high){
            int mid= low+(high-low)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;

            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        int low1=0;
        int high1=nums.length-1;
        
        
           while(low1<=high1){
            int mid= low1+(high1-low1)/2;
            if(nums[mid]==target){
                last=mid;
                low1=mid+1;

            }
            else if(nums[mid]>target){
                high1=mid-1;
            }
            else{
                low1=mid+1;
            }
        }

        return  new int[] {first,last};
        
    }
}