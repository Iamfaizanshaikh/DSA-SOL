import java.util.*;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        // HashMap<Integer, Integer> freq = new HashMap<>();
        // int[] result = new int[2];
        // int index = 0;

        // for (int num : nums) {
        //     freq.put(num, freq.getOrDefault(num, 0) + 1);
            
        //     // when a number appears the 2nd time → it's sneaky
        //     if (freq.get(num) == 2) {
        //         result[index++] = num;
                
        //         // once we find 2 sneaky numbers, stop early
        //         if (index == 2) break;
        //     }
        // }

        // return result;


        int[] arr= new int[2];
        int k=0;
        for(int i=0; i<=nums.length-2; i++){

            for(int j=i+1; j<=nums.length-1; j++){

                if(nums[i]==nums[j]){
                    arr[k] +=nums[i];
                    k++;

                }
                if(k==2){
                    break;
                }

            }
        }
        return arr;
        
    }
}