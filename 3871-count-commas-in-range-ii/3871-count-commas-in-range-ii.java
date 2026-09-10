class Solution {
    public long countCommas(long n) {
        if(n<1000) return 0;


        long total=0;
        long level=1000;
        long comma=1;

        while(level<=n){
            long upper= level*1000-1;
            if(upper>n){
                upper=n;
            }
            long count= upper-level+1;
            total+=count*comma;
            level*=1000;
            comma++;
        }
        
        // if(n>=1000){
        //     Long upper=Math.min(n,999999);
        //     long count=upper-1000+1;
        //     total+=count*1;
        // }
        
        // if(n>=1000000){
        //     Long upper=Math.min(n,999999999);
        //     Long count=upper-1000000+1;

        //     total+=count*2;

        // }
        
        // if(n>=1000000000){
        //     Long upper=Math.min(n,9999999999L);
        //     Long count=upper-1000000000L+1;

        //     total+=count*3;

        // }
      
        // if(n>=1000000000000L){
        //     Long upper=Math.min(n,999999999999999L);
        //     Long count=upper-1000000000000L+1;

        //     total+=count*4;

        // }

        return total;
        

     
        
    }
}