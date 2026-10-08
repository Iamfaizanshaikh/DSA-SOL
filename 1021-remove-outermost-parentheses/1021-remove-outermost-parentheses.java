class Solution {
    public String removeOuterParentheses(String s) {
        int balance =0;
        String ans="";

        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);

            if(ch=='('){
                if(balance!=0){
                    ans+=ch;
                }
                balance++;
            } 
            else{
                balance--;
                if(balance!=0){
                    ans+=ch;
                }   
            }

        }
        return ans;

        
        
    }
}