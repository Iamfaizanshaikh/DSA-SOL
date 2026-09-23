class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        if(s.equals(goal)) return true;

        char[] ch= new char[s.length()];
        char one=goal.charAt(0);
        int place=0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==one){
                int left=0;
                int num=i;

                while(left<s.length()){
                    ch[left]=s.charAt(num);
                    num=(num+1)%s.length();
                    left++;
                }

                String temp= new String(ch);

                if(temp.equals(goal)){
                    return true;
                }
              
                
               
            }
        }
        return false;
        
        
    }
}