class Solution {
    public int countCommas(int n) {
        if(n<1000) return 0;

        return n-999;

        

        // String st= String.valueOf(n);
        // int count=0;
        // int total=0;
        // for(int i=1000; i<=n;i++){
        //     total++;
        // }
        // int len=st.length()-1;
        // for(int i=len; i>0; i--){
        //     if(i%3==0) count++;
        // }

        // return count*total;

        
    }
}