class Solution {
    public int maxArea(int[] height) {
        //optimal sollution
        int lp = 0;
        int rp = height.length - 1;
        int MaxArea = 0;
        

        while (lp < rp) {

            int width = rp - lp;
            int h = Math.min(height[lp], height[rp]);
            int currentarea = width * h;
            if (MaxArea < currentarea) {
                MaxArea = currentarea;
            }

            if (height[lp] < height[rp]) {
                lp++;

            }
            else{
                rp--;
            }


        }
        return MaxArea;

        //Brute force approach
        // int max=0;
        // for(int i=0; i<height.length; i++){
        //     for (int j=height.length-1; j>i; j--){
        //         int width=j-i;
        //         int h=Math.min(height[i],height[j]);
        //         int current= width*h;

        //         if(current>max){
        //         max=current;
        //         }
        //     }
        // }
        // return max;

    }
}