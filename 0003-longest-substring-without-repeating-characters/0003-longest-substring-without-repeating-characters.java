class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set= new HashSet<>();
        int left=0;
        int right=0;
        int n=s.length();
        int maxlen=0;
        while(right<n){

            if(set.contains(s.charAt(right)))
            {   
                set.remove(s.charAt(left));
                left++;

            }
            else{
                set.add(s.charAt(right));
               
                right++;
            }
            maxlen=Math.max(maxlen,set.size());



        }

                
        
    return maxlen;
        
    }
}