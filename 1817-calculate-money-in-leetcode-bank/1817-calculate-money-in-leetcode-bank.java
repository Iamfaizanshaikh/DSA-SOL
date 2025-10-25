class Solution {
    public int totalMoney(int n) {
        if(n<=7){
            return n*(n+1)/2;
        }

        int week= n/7;
        int rem=n%7;
        int firstweek=28;
        int d=7;
        //int lastweek=0;
       int lastweek= firstweek+(week-1)*d;
        double total=(week/2.0)*(firstweek+lastweek);
         for(int i=week+1; i<=rem+week; i++){
            total+=i;
         }










        // int total=0;
        // int start=1;
        // int week=1;
        // for(int i=1; i<=n; i++){
        //     total+=start;
        //     start++;
        //     if(i%7==0){
        //         week++;
        //         start=week;
        //     }
            
        // }
         return (int)total;
    }
}