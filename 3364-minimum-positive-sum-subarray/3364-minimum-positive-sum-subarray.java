class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {


        int min=Integer.MAX_VALUE;

        for(int i=0; i<nums.size(); i++){

            int count=0;
            int sum=0;

            for(int j=i; j<nums.size(); j++){
                count++;

                sum+=nums.get(j);

                if(count>=l && count<=r &&sum>0){
                    min=Math.min(min,sum);
                }

                if(count>r){
                    break;
                }


            }
        }

        return min==Integer.MAX_VALUE?-1:min;
        
    }
}