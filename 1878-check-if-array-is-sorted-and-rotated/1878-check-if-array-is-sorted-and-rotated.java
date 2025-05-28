class Solution {
    public boolean check(int[] nums) {
int x=0;
int n= nums.length;
// boolean result=false;
        for(int i=0; i<n-1; i++){
        
            if(nums[i]>nums[i+1]){
                x++;

            }
        
        }
           if(nums[n- 1] > nums[0]) {
            x++;
        }
    //     if(x>1){
    //         result=false;

    //     }
    //    else{
    //         result= true;
    //     }
        return x<=1;
        
    }
}