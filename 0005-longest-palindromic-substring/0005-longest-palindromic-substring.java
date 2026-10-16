class Solution {
    private int expand(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;    }
    public String longestPalindrome(String s) {
        int start=0;
        int maxlen=0;

            for(int j=0; j<s.length(); j++){
                int len1= expand(s,j,j);
                int len2= expand(s,j,j+1);

                int len= Math.max(len1,len2);

                if(len>maxlen){
                    maxlen=len;
                    start= j-(len-1)/2;
                }   

            }

            return s.substring(start,start+maxlen);
        
        
    }
}