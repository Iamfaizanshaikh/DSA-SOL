class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() > s2.length()){
            return false;
            }
        int[] freq = new int[26];
        int[] comp= new int[26];

        int size=s1.length();

        for (int i = 0; i < size; i++) {
            freq[s1.charAt(i)-'a']++;
        }
       

        int right=size;
        int left=0;
        for(int i=0; i<size; i++){
            comp[s2.charAt(i)-'a']++;
        }
        while(right<=s2.length()){
            if(Arrays.equals(freq,comp)){
                return true;
            }
            if(right==s2.length()){
                break;
            }
            
            comp[s2.charAt(left)-'a']--;
            left++;
            comp[s2.charAt(right)-'a']++;
            right++;
            
            
            

        }
        return false;

    }
}