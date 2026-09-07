class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words= s.split(" ");
        if(words.length!=pattern.length()) return false;

        Map<Character, String> map= new HashMap<>();
        for(int i=0; i<words.length; i++){
            char ch=pattern.charAt(i);
            String word= words[i];

            if(map.containsKey(ch)){
                if(!map.get(ch).equals(word)) return false;

            }else{
                if(map.containsValue(word)) return false;
                map.put(ch,word);
            }

        }





















        // int count=0;
        // for(int i=0; i<s.length(); i++){
        //     if(s.charAt(i)==' '){
        //         count++;
        //     }
        // }
        // if(pattern.length()!=count+1) return false;

        // Map<String,Character> map= new HashMap<>();
        // int j=0;
        // StringBuilder st= new StringBuilder();

        // for(int i=0; i<s.length(); i++){  
        //     if(s.charAt(i)==' '){
        //         String word= st.toString();
        //         char ch=pattern.charAt(j);

        //         if(map.containsKey(word)){
        //             if(map.get(word)!=ch) return false;

        //         } else{
        //             if(map.containsValue(ch)){
        //                 return false;
        //             }
        //             map.put(word,ch);
        //         }
                
        //         st.setLength(0);
        //         j++;

        //     }
        //     else{
        //         st.append(s.charAt(i));
        //     }
        // }
        // if (st.length() > 0) {
        //     String word = st.toString();
        //     char ch = pattern.charAt(j);

        //     if (map.containsKey(word)) {
        //         if (map.get(word) != ch) {
        //             return false;
        //         }
        //     } else {
        //         if (map.containsValue(ch)) {
        //             return false;
        //         }
        //         map.put(word, ch);
        //     }
        // }

        return true;

        
    }
}