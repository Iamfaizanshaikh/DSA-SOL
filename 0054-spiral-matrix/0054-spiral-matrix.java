class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> arr= new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;

        int top=0;
        int bottom=n-1;
        int left=0;
        int right=m-1;

        while(top<=bottom && left<=right){

        for(int i=left; i<=right; i++){
            arr.add(matrix[top][i]);
        }
        top++;
         for(int i=top; i<=bottom; i++){
            arr.add(matrix[i][right]);
        }
        right--;

      if (top <= bottom) {   // for bottom row
        for (int i = right; i >= left; i--)
        arr.add(matrix[bottom][i]);
        bottom--;
        }

        if (left <= right) {   // for left column
        for (int i = bottom; i >= top; i--)
       arr.add(matrix[i][left]);
        left++;
        }
        }

      
        return arr;
        
    }
}