class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int ans1=-1;
            while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
             ans1=mid;
             right=mid-1;

            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }

        int left2=0;
        int right2=nums.length-1;
        int ans2=-1;
            while(left2<=right2){
            int mid=left2+(right2-left2)/2;
            if(nums[mid]==target){
             ans2=mid;
             left2=mid+1;

            }
            else if(nums[mid]>target){
                right2=mid-1;
            }
            else{
                left2=mid+1;
            }
        }
        return new int[]{ans1,ans2};
        
        
    }
}

































// int low=0;
//         int high=nums.length-1;
//         int first=-1;
//         int last=-1;

//         while(low<=high){
//             int mid= low+(high-low)/2;
//             if(nums[mid]==target){
//                 first=mid;
//                 high=mid-1;

//             }
//             else if(nums[mid]>target){
//                 high=mid-1;
//             }
//             else{
//                 low=mid+1;
//             }
//         }

//         if (first == -1) {
//     return new int[]{-1, -1};
// }


//         int low1=0;
//         int high1=nums.length-1;
        
        
//            while(low1<=high1){
//             int mid= low1+(high1-low1)/2;
//             if(nums[mid]==target){
//                 last=mid;
//                 low1=mid+1;

//             }
//             else if(nums[mid]>target){
//                 high1=mid-1;
//             }
//             else{
//                 low1=mid+1;
//             }
//         }

//         return  new int[] {first,last};