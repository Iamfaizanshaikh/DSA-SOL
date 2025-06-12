class Solution {
    public boolean search(int[] nums, int target) {

int low=0;
int high=nums.length-1;
boolean bool=false;

while(low<=high){
    int mid= low+(high-low)/2;

    if(nums[mid]==target){
        bool=true;
       break;

    }

    if(nums[low]==nums[mid] && nums[mid]==nums[high]){
        low++;
        high--;
        continue;
    }
 

    if(nums[low]<=nums[mid]){

        if(target>=nums[low] && target<=nums[mid]){

        high=mid-1;


    }
    else{
        low=mid+1;
    }
    }

   
    else{


 if(target>=nums[mid] && target<=nums[high]){
        low=mid+1;

    }
    else{
        high=mid-1;
    }

    }


}
return bool;

        















        // int start=0;
        // int end=nums.lemgth-1;
        // while(start<end){
        //     int temp=nums[start];
        //     nums[start]=nums[end];
        //     nums[end]=temp;
        //     start++;
        //     end--;

        
























        // boolean bool= false;
        // int j=nums.length-1;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]==target || nums[j]==target){
        //         bool= true;
        //         break;
        //     }
        //     j--;
        // }
        // return bool;
        
    }
}