class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0){
            return;
        }else if(m==0){
           for(int i=0;i<n;i++){
            nums1[i]=nums2[i];
           }
            return;
        }
        int i=m-1;
        int j=n-1;
        int k=(m+n)-1;

        while(k>=0 && j>=0){
            if(i<0){
                nums1[k]=nums2[j];
                j--;
                
            }else if(nums2[j]>nums1[i]){
                nums1[k]=nums2[j];
                j--;
                
                
            }else if(nums1[i]>=nums2[j]){
                nums1[k]=nums1[i];
                
                i--;
               
            }
            
       

            
        k--;
        

        }


   System.out.println(Arrays.toString(nums1));
    
//nums1 =
// [2,0]
// m =
// 1
// nums2 =
// [1]
// n =
// 1
        
    }
}