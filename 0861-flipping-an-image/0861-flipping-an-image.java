class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        

             for (int i = 0; i < image.length; i++) {
    int n = image[i].length;
    for (int j = 0; j < (n + 1) / 2; j++) {
        int temp = image[i][j] ^ 1;
        image[i][j] = image[i][n - j - 1] ^ 1;
        image[i][n - j - 1] = temp;
    }
}
   
             
            

        

        return image;

        
    }
}