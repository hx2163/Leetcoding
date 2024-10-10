class Solution {
    
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        // Step 1: Find the first decreasing element from the end
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: If such element is found, find the element just larger than nums[i]
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Step 3: Swap them
            swap(nums, i, j);
        }

        // Step 4: Reverse the part after index i
        reverse(nums, i + 1);
    }
        
    
    private void swap (int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;    
    }
        
    private void reverse (int[] nums, int start){
        int l = start;
        int r = nums.length-1;
            
        while(l < r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }
    
}