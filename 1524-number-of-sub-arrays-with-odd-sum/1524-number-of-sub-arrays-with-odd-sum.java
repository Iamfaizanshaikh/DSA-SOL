class Solution {
    public int numOfSubarrays(int[] arr) {

        int mod=1000000007;

        long even=1;
        long odd=0;
        long count=0;
        int prefix=0;

        for(int num: arr){

            prefix+=num;

            if(prefix%2==0){
                count=(count+odd)%mod;
                even++;
            }
            else{
                count=(count+even)%mod;
                odd++;
            }
        }


        return (int) count;






        // int n= arr.length;
        // int[] prefixsum= new int[n];
        // prefixsum[0]=arr[0];
        // for(int i=1; i<n; i++){
        //     prefixsum[i]=prefixsum[i-1]+arr[i];
        // }

        // int count=0;

        // for(int i=0; i<n; i++){
            
        //     for(int j=i; j<n; j++){

        //         int sum=prefixsum[j];

        //         if(i>0){
        //             sum-=prefixsum[i-1];
        //         }

        //         if(sum%2!=0){
        //             count++;
        //         }

        //     }
        // }

        // return count;
    }
}