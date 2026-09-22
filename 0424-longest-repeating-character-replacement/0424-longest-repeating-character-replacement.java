class Solution {
    public int characterReplacement(String s, int k) {

        int maxfrq=0;
        int left=0;
        int max=0;
        int[] freq= new int[26];

        for(int right=0;right<s.length(); right++){
            int index=s.charAt(right)-'A';
            freq[index]++;

            maxfrq=Math.max(maxfrq,freq[index]);
            int replacement=(right-left+1)-maxfrq;
            if(replacement>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            max=Math.max(max,right-left+1);
        }


        return max;
    
    }
}