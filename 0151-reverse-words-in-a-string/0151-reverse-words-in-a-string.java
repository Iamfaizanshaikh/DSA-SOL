class Solution {
    public String reverseWords(String s) {

        String[] str= s.trim().split("\\s+");
        String reverse="";

        for(int i=str.length-1; i>=0; i--){
            reverse+=str[i];

              if (i!=0){
                reverse+=" ";
            }
        
        }


        return reverse;

       
       
        
        
    }
}