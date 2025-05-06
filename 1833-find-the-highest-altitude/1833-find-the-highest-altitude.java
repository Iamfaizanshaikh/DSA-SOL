class Solution {
    public int largestAltitude(int[] gain) {
        int[] store= new int[gain.length+1];
        store[0]=0;
        int sum=0;

        for(int i=0; i<gain.length; i++){
           
            store[i]=gain[i]+sum;
            sum+=gain[i];

           

        }
        int max=0;
        for(int i=0; i<store.length; i++){
            if(store[i]>max){
                max=store[i];
            }

        }
        return max;
        
    }
}