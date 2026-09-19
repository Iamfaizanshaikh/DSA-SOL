class Solution {
    public String removeOuterParentheses(String s) {
        int balance =0;
        String ans="";

        Stack<Character> stack= new Stack<>();

        for(char ch: s.toCharArray()){

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