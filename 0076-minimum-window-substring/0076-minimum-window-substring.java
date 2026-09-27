class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<t.length(); i++){
            char ch= t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int start=0;
        int left=0;
        int count=0;
        int minlength=Integer.MAX_VALUE;
        
       
        for(int right=0; right<s.length(); right++){
            char ch=s.charAt(right);
            

            if(map.containsKey(ch)){        
                if(map.get(ch)>0){
                    count++;
                }
                map.put(ch,map.get(ch)-1);
            }
            while(count==t.length()){

                if(right-left+1<minlength){
                    minlength=right-left+1;
                    start=left;
                }

                char leftchar=s.charAt(left);
                if(map.containsKey(leftchar)){

                    map.put(leftchar,map.get(leftchar)+1);

                    if(map.get(leftchar)>0){
                        count--;
                    }

                }
                left++;

            }



        }

        if(minlength==Integer.MAX_VALUE) return "";

        return s.substring(start,start+minlength);

        
    }
}