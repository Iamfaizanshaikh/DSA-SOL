class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int[] arr= new int[nums.size()];
        arr[0]=nums.get(0);

        for(int i=1; i<nums.size(); i++){
            arr[i]=arr[i-1]+nums.get(i);
        }

        int min=Integer.MAX_VALUE;

        for(int i=0; i<nums.size(); i++){

            for(int j=i+l-1;  j<nums.size() && j<i+r; j++){

                int sum=arr[j]-(i==0?0:arr[i-1]);

                if(sum>0){
                    min=Math.min(min,sum);
                }
            }
        }

        return min==Integer.MAX_VALUE?-1:min;


        // int min=Integer.MAX_VALUE;

        // for(int i=0; i<nums.size(); i++){

        //     int count=0;
        //     int sum=0;

        //     for(int j=i; j<nums.size(); j++){
        //         count++;

        //         sum+=nums.get(j);

        //         if(count>=l && count<=r &&sum>0){
        //             min=Math.min(min,sum);
        //         }

        //         if(count>=r){
        //             break;
        //         }


        //     }
        // }

        // return min==Integer.MAX_VALUE?-1:min;
        
    }
}