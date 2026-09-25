class Solution {
    public int totalFruit(int[] fruits) {
        
        HashMap<Integer,Integer> map= new HashMap<>();
        int left=0;
        int right=0;
        int max=0;
        int n= fruits.length;
        while(right<n){
            int key=fruits[right];
            map.put(key,map.getOrDefault(fruits[right],0)+1);
            right++;
            

            while(map.size()>2){
                int val=fruits[left];
                map.put(val,map.get(val)-1);
                

                if(map.get(val)==0){
                    map.remove(val);
                }
                left++;
            }
            max=Math.max(max, right-left);

        }

        return max;
        
    }
}