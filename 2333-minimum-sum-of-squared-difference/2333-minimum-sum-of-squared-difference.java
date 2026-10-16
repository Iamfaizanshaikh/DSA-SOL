class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {

        
        int[] freq= new int[100001];
        for(int i=0; i<nums1.length; i++){
            int d= Math.abs(nums1[i]-nums2[i]);
            freq[d]++;
        }

        int k=k1+k2;
        for(int i=freq.length-1; i>0 && k>0; i--){
            int countop=Math.min(k,freq[i]);

            freq[i]-=countop;
            freq[i-1] +=countop;

            k-=countop;
        }

        long ans=0;
        for(int i=0; i<freq.length; i++){
            ans+=(long)freq[i]*i*i;
        }






























 
        // int n = nums1.length;
        // PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        // for (int i = 0; i < n; i++) {
        //    pq.add(Math.abs(nums1[i]-nums2[i]));
        // }
        // int k= k1+k2;

        // while(k>0 && pq.peek()>0){
        //     int largest=pq.poll();
        //     largest--;
        //     pq.add(largest);
        //     k--;
        // }

        // long ans=0;

        // while(!pq.isEmpty()){
        //     int num=pq.poll();
        //     ans+=num*num;
        // }

       return ans;
    }
}