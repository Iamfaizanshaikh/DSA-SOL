class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int missing=0;
        int previous=0;

        for(int i=0; i<arr.length; i++){
            int gap=arr[i]-previous-1;

            if(missing+gap>=k){
                return previous+(k-missing);
            }
            missing+=gap;
            previous=arr[i];
         
            
        }
        return previous+(k-missing);
       
    }
}