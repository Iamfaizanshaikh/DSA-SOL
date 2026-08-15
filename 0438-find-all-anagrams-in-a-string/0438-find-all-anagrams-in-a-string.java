class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list= new ArrayList<>();
        if(s.length() < p.length()){
            return list;
        }

        int[] freq = new int[26];
        int[] comp = new int[26];

        int size = p.length();
        

        for(int i = 0; i < size; i++){
            freq[p.charAt(i) - 'a']++;
        }

        for(int i = 0; i < size; i++){
            comp[s.charAt(i) - 'a']++;
        }

        int left = 0;
        int right = size;

        while(right <= s.length()){

            if(Arrays.equals(freq, comp)){
                list.add(left);
            }

            if(right == s.length()){
                break;
            }
            

            comp[s.charAt(left) - 'a']--;
            left++;

            comp[s.charAt(right) - 'a']++;
            right++;
        }

        return list;
 
        
    }
}