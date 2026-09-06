class Solution {
    public boolean isAnagram(String s, String t) {
          if (s.length() != t.length()) {
            return false;
        }
        Map<Character,Integer> mapS= new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(mapS.containsKey(ch)){
                mapS.put(ch, mapS.get(ch)+1);
            }
            else{
                mapS.put(ch,1);
            }

        }

        for(int i=0; i<t.length(); i++){
            char ch= t.charAt(i);
            if(!mapS.containsKey(ch)){
                return false;
            }
            int count=mapS.get(ch);
            if(count==1){
                mapS.remove(ch);
            }
            else{
                mapS.put(ch,count-1);
            }

       
            
        }


        return mapS.isEmpty();
     
    }
}