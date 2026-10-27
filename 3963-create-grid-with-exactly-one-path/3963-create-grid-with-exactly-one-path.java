class Solution {
    public String[] createGrid(int m, int n) {
        char[][] arr= new char[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){

                arr[i][j]='#';

            }
        }

        for(int i=0; i<n; i++){
           arr[0][i]='.';
        }

        for(int k=0; k<m; k++){

            arr[k][n-1]='.';

        }
        String[] ans= new String[m];
        int idx=0;
        for(char[] ch:arr){
            String str=String.valueOf(ch);

            ans[idx++]=str;

        }

        return ans;

        
    }
}