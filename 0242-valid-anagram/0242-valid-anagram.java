class Solution {
    public boolean isAnagram(String s, String t) {
          if (s.length() != t.length()) {
            return false;
        }
        int[] count= new int[26];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        for(int v:count){
            if(v!=0) return false;
        }
        // Map<Character,Integer> map= new HashMap<>();

        // for(int i=0; i<s.length(); i++){
        //     char sc=s.charAt(i);
        //     char tc=t.charAt(i);
        //     map.put(sc,map.getOrDefault(sc,0)+1);
        //     map.put(tc,map.getOrDefault(tc,0)-1);
           
        // }
        // for(int value:map.values()){
        //     if(value!=0){
        //         return false;
        //     }
        // }

        return true;
     
    }
}