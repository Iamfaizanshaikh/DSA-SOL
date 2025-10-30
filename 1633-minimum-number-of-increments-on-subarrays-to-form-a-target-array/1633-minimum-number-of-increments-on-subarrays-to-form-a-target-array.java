class Solution {
    public int minNumberOperations(int[] target) {
        

        int op=0;
        int prev=0;
        for(int i=0; i<target.length; i++){

            if(target[i]>=prev){
                op+=target[i]-prev;
            }
            prev=target[i];

        }

        return op;



        
    }
}