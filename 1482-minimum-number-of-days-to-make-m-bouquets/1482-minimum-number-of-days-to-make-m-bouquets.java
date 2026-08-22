class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length) return -1;
        int max=0;
        for(int i=0; i<bloomDay.length; i++){
            max=Math.max(max, bloomDay[i]);
        }
        int left=0;
        int right=max;

        while(left<right){
            int mid=left+(right-left)/2;
            int consecutive=0;
            int bouquets=0;
            for(int i=0; i<bloomDay.length; i++){
                if(bloomDay[i]<=mid){
                    consecutive++;
                    if(consecutive==k){
                        bouquets++;
                        consecutive=0;
                    }
                }
                else{
                    consecutive=0;
                }

            }

            if(bouquets>=m){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;



        
    }
}