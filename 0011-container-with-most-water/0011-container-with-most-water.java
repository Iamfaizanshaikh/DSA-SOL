class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j= height.length-1;
        int maxwater=0;
        
        while(i<j){
            int area= Math.min(height[j],height[i])*(j-i);
            maxwater=Math.max(maxwater,area);
            if(height[j]>height[i]){
                i++;

            }
            else{
                j--;

            }

        }

        return maxwater;

    }
}