class Solution {
    public boolean isPalindrome(String s) {

        int left=0;
        int right=s.length()-1;

        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;    
            }
            else{
            char leftch=Character.toLowerCase(s.charAt(left));
            char rightch=Character.toLowerCase(s.charAt(right));

            if(leftch==rightch){
                left++;
                right--;
            }
            else{
                return false;
            }

            }
        }
        return true;
        

        
    }
}