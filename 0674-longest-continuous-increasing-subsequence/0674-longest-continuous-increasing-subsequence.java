class Solution {
    //Sliding Window
    public int findLengthOfLCIS(int[] nums) {
        int res = 0;
        int anchor = 0;
        
        for(int i=0; i < nums.length; i++){
            //if decresing set anchor
            if(i > 0 && nums[i-1] >= nums[i]){
                anchor = i;
            }
            res = Math.max(res, i + 1 - anchor );
        }        
        return res;
    }
}