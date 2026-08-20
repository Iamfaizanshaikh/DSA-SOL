class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int tw=0;
        int mw=0;

        for(int i=0; i<weights.length; i++){
            tw+=weights[i];
            mw=Math.max(mw, weights[i]);
        }
        int left=mw;
        int right=tw;
        while(left<right){
            int mid= left+ (right-left)/2;
            int cw=0;
            int day=1;

            for(int i=0; i<weights.length; i++){
                if(cw+weights[i]<=mid){
                    cw+=weights[i];

                }
                else{
                    day++;
                    cw=weights[i];
                }



            }
            if(day>days){
                left=mid+1;

            }
            else{
                right=mid;

            }


            
        }
        return left;
        
    }
}