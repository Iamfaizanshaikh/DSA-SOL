class Solution {
    public int findContentChildren(int[] g, int[] s) {

          Arrays.sort(s);
          Arrays.sort(g);
        
     
        
        int count=0;
        int child=0;
        int cook=0;
        while(child<g.length && cook<s.length){
           if(s[cook]>=g[child]){
            child++;
            cook++;
            count++;
           }
           else {
            cook++;
           }

        }

        return count;
        
    }
}