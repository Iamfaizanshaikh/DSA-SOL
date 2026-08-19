class Solution {
    public int minEatingSpeed(int[] piles, int h){
        int maxPile=0;
        for(int i=0; i<piles.length; i++){
            maxPile=Math.max(maxPile,piles[i]);
        }
        int left=1;
        int right=maxPile;
        while(left<right){
            int mid=left+(right-left)/2;
            int time=0;
            for(int i=0; i<piles.length; i++){
            time+=(piles[i]+mid-1)/mid;
            }

            if(time<=h){
                right=mid;
            }
            else{
                left=mid+1;
            }
        time=0;

        }
        return left;

        
    }
}