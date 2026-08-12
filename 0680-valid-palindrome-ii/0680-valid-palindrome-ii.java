class Solution {
    public boolean validPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
        if(s.charAt(left)==s.charAt(right)){
        left++;
        right--;
        }
        else{
            return ispalindrome( s , left,right-1) || ispalindrome( s, left+1,right);
        }
                       

        }
        
return true;
    }
           public  boolean ispalindrome(String s ,int a, int b){
            while(a<b){
                if(s.charAt(a)!=s.charAt(b)) return false;
                else{
                    a++;
                    b--;
                }
            }
            return true;
        
    }
  
    }
    