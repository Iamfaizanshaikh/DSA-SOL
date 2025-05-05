class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result= new int[nums.length];
        int j = n; // Start of y-part
        int  k = 0;
        for (int i = 0; i < n; i++) {
            
            result[k++] = nums[i];   // x1, x2, ...
            result[k++] = nums[j++]; // y1, y2, ...
       

            }
          
            return result;
        }
        
    
        
    }

