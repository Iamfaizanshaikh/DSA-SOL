class Solution {
    public void reverseString(char[] s) {
       
        // char[] arr = {'h', 'e', 'l', 'l', 'o'};
        
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            left++;
            right--;
        }
        Arrays.toString(s);
        
        
        }
        
    }
