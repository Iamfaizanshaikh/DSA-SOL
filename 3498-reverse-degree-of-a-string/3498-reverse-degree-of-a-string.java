class Solution {
    public int reverseDegree(String s) {

        int sum=0;
        for(int i=0; i<s.length(); i++){
            int val=123-s.charAt(i);
            sum+=val*(i+1);
        }
        return sum;
       
        
    }
}