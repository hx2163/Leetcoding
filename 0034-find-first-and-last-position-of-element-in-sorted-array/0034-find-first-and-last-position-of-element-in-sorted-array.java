class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        int count = 0;
        
        for(int i=0; i< nums.length; i++){
            if(nums[i] == target && count == 0){
                res[0] = i;
                res[1] = i;
                count ++;
            }
            if(nums[i] == target && count != 0){
                res[1] = i;
            }
        }
        return res;
    }
}