class Solution {
    public String removeKdigits(String num, int k) {
        int n= num.length();
        Stack<Character> stack= new Stack<>();

        for(int i=0; i<num.length(); i++){
            char digit=num.charAt(i);

            while(k>0 && !stack.isEmpty() && stack.peek()>digit){
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        while(k>0){
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();

        for( char ch :stack){
            sb.append(ch);
        }
        int i=0;

        while(i<sb.length() && sb.charAt(i)=='0'){

            i++;

        }

        String result=sb.substring(i);
        return result.isEmpty() ? "0" : result;


        
          

    }
}