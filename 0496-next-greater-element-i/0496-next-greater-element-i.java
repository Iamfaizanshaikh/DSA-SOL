class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] ans = new int[nums1.length];
        int len = 0;

        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;
            
            for (int j = 0; j < nums2.length; j++) {
                

                if (nums1[i] == nums2[j]) {
                    int k = j + 1;

                    while (k < nums2.length) {
                        if (nums2[k] > nums1[i]) {
                            ans[i] = nums2[k];
                            found = true;
                            break;

                        }
                        k++;

                    }
                    if (!found) {
                        ans[i] = -1;
                    }
                    break;
                }

            }
        }

        return ans;

    }
}