class Solution {
     public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);   
    }

    private int atmost(int[] nums, int k){
         HashMap<Integer,Integer> map= new HashMap<>();
        int left=0;
        int count=0;
        for(int right=0; right<nums.length; right++){
            int num= nums[right];
            map.put(num,map.getOrDefault(num,0)+1);

           

                while(map.size()>k){
                    int leftnum=nums[left];
                    map.put(leftnum,map.get(leftnum)-1);
                    if(map.get(leftnum)==0){
                        map.remove(leftnum);
                    }
                    left++;

                    
                }
                count+=right-left+1;

            
        }

        return count;

    }
   
}