class Solution {
    
    /*
        ues dp arr
    */
    public int maxSubArray1(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length+1];
        dp[0] = nums[0];
        int result = dp[0];
        for(int i = 1; i < length; i++){
            dp[i] = Math.max(nums[i], dp[i-1] + nums[i]);            
            if(dp[i] > result){
                result = dp[i];
            }
        }
        return result;
    }
    
    /*
    without using dp arr
    */
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int per = result;
        for(int i = 1; i < nums.length; i++){
            per = Math.max(nums[i], per + nums[i]);
            if(per > result) result = per;
        }
        return result;        
    }  
}