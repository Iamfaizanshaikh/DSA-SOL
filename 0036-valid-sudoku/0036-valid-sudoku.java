class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<String> set= new HashSet<>();

        for(int i=0; i<board.length; i++){

            for(int j=0; j<board.length; j++){
                char num=board[i][j];
                if(num == '.') continue;  
                
            String rowKey= "row"+ i + num;
            String colKey= "col"+ j + num;
            String boxKey= "box"+ (i/3) + (j/3)+ num;

            if(set.contains(rowKey) || set.contains(colKey) || set.contains(boxKey)) return false;
                
            
            set.add(rowKey);
            set.add(colKey);
            set.add(boxKey);
            }


        }

        return true;
    }
}