class Solution {
    public int minOperations(int[] nums) {
        int n= nums.length;
        int k= nums[0];

        boolean increasing=true;
        int idx=-1;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                idx=i;
            }
            if(nums[i] !=k){
                increasing=false;
                break;
            }

            k=(k+1)%n;

        }
        boolean decreasing= true;
        k=nums[0];
        for(int i=0; i<n; i++){

            if(nums[i]==0){
                idx=i;
            }

            if(nums[i] !=k){
                decreasing= false;
                break;

            }
            k= (k-1+n)%n;

        }

        if(increasing){
            return Math.min(idx, n-idx+2);
        }
        if(decreasing){
            return Math.min(idx+2, n-idx);
        }

        return -1;
        
    }
}