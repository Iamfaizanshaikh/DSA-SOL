class Solution {
    
    public static int mincost(int[] costs,int[] dp,int i){
        
        if(i>=costs.length) return 0;
        if(dp[i]!=-1) return dp[i];

        int a= mincost(costs,dp,i+1)+costs[i];
        int b= mincost(costs,dp,i+2)+costs[i];
        return dp[i]=Math.min(a,b);
    }

    // public static int updown(int[] cost, int i){
    //     if(i==0 || i==1) return cost[i];

    //     int a=cost[i]+updown(cost,i-1);
    //     int b= cost[i]+updown(cost,i-2);

    //     return Math.min(a,b);
    // }
    public int minCostClimbingStairs(int[] cost) {

        int[] dp= new int[cost.length+1];
        Arrays.fill(dp,-1);
        return Math.min(mincost(cost,dp,0),mincost(cost,dp,1));

        // int n=cost.length;
        // return Math.min(updown(cost,n-1),updown(cost,n-2));
    }
}