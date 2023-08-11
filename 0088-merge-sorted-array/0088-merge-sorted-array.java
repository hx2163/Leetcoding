class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = nums1.length;
        for (int i = k - 1, nums1Index = m-1, nums2Index = n-1;
         i >= 0;
         i--){
            if(nums1Index < 0){ // nums1 empty
                nums1[i] = nums2[nums2Index];
                nums2Index--;
            }else if (nums2Index < 0){
                break;
            }else if (nums1[nums1Index] > nums2[nums2Index]){
                nums1[i] = nums1[nums1Index];
                nums1Index--;
            }else{
                nums1[i] = nums2[nums2Index];
                nums2Index--;
            }
        }

    }
}