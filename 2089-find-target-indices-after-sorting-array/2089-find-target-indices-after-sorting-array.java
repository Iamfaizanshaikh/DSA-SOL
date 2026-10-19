class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list=   new ArrayList<>();
        int targetcount=0;
        int lessthentarget=0;
        for(int num : nums){
            if(num==target){
                targetcount++;
            }
            if(num<target){
                lessthentarget++;
            }
        }

        for(int i=0; i<targetcount; i++){
            list.add(lessthentarget+i);
        }
      
        return list;
        
    }
}