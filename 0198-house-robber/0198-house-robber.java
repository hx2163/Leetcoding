
    //如果抢劫了第 i -1 个住户，那么就不能再抢劫第 i 个住户
    // dp[i] = max(dp[i-1], dp[i-2]+ nums[i])


class Solution {
    public int rob(int[] nums) {
        int dp[]= new int[nums.length+1];
        int sum=0;
        Arrays.fill(dp,-1);
        return helper(nums,nums.length-1, dp);
    }
    
    public int helper(int[] nums,int i, int[] dp){
        if(i < 0) return 0;
        if(i == 0) return nums[i];
        if(dp[i]!= -1) return dp[i];  
        int take = nums[i] + helper(nums,i-2,dp);
        int nottake = helper(nums,i-1,dp);
        dp[i]= Math.max(take, nottake);
        return dp[i];
    }
}