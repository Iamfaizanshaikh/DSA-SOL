class Solution {
    public List<Integer> majorityElement(int[] nums) {
    List<Integer> list=new ArrayList<>();
    if(nums.length==0 || nums==null ) return list;
    int n=nums.length/3;
    
      
    for(int i=0;i<nums.length;i++){
        int count=0;
        if(list.contains(nums[i])) continue;

        for(int j=0; j<nums.length; j++){
            
            if(nums[i]==nums[j]){
                count++;
            }

        }
        if(count>n){
            list.add(nums[i]);
            
        }


    }
    return list;
        
      
    }
}