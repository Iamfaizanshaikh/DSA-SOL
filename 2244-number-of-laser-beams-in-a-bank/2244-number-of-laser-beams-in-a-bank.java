class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0;   
        int total = 0;  

        for (String row : bank) {
            int current = 0;  

         
            for (char c : row.toCharArray()) {
                if (c == '1') current++;
            }

            
            if (current > 0) {
                
                total += prev * current;

                
                prev = current;
            }
        }

        return total;
    }
}
